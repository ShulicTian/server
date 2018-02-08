/*****************************************************
 * Author  : wadecha
 * Version : 1.0
 * Date    :  2015/9/18
 ****************************************************/
var _ = require('lodash');
var mysqlConfig = require("../../config/web_config").mysqlConfig;
var mysql = require('mysql');
var async = require('async');

var pool = mysql.createPool({
	host: mysqlConfig.host,
	port: mysqlConfig.port,
	user: mysqlConfig.user,
	password: mysqlConfig.password,
	database: mysqlConfig.database
});

exports.getConnection = function (callback) {
	pool.getConnection(callback);
};

exports.executeObject = function (/*sql, params, callback*/) {
	var _args = arguments;
	pool.getConnection(function (err, connection) {
		var callback = _args[_args.length - 1];
		if (err)return callback(err);

		var args = Array.prototype.slice.call(_args, 0);
		args[args.length - 1] = function (err, results) {
			connection.config.queryFormat = null;
			pool.releaseConnection(connection);
			callback(err, (results && results.length > 0) ? results[0] : undefined);
		};
		connection.config.queryFormat = function (query, values) {
			if (!values) return query;
			return query.replace(/\:(\w+)/g, function (txt, key) {
				if (values.hasOwnProperty(key)) {
					return this.escape(values[key]);
				}
				return txt;
			}.bind(this));
		};
		connection.query.apply(connection, args);
	});
};

exports.executeList = function (/*sql, params, callback*/) {
	var _args = arguments;
	pool.getConnection(function (err, connection) {
		var callback = _args[_args.length - 1];
		if (err)return callback(err);

		var args = Array.prototype.slice.call(_args, 0);
		args[args.length - 1] = function (err, results) {
			connection.config.queryFormat = null;
			pool.releaseConnection(connection);
			callback(err, results);
		};
		connection.config.queryFormat = function (query, values) {
			if (!values) return query;
			return query.replace(/\:(\w+)/g, function (txt, key) {
				if (values.hasOwnProperty(key)) {
					return this.escape(values[key]);
				}
				return txt;
			}.bind(this));
		};
		connection.query.apply(connection, args);
	});
};

exports.executeByTran = function (sqlTasks, callback) {
	pool.getConnection(function (err, connection) {
		if (err) {
			return callback(err);
		}

		connection.beginTransaction(function (err) {
			if (err) {
				pool.releaseConnection(connection);
				return callback(err);
			}
			var tasks = [];
			sqlTasks.forEach(function (sqlTask) {
				tasks.push(function (callback2) {
					connection.query(sqlTask.sql, sqlTask.paras, callback2);
				});
			});

			async.series(tasks, function (err, taskResult) {
				if (err) {
					connection.rollback(function (err2) {
						pool.releaseConnection(connection);
						callback(err);
					});
					return;
				}

				taskResult = _.flatten(taskResult);
				connection.commit(function (err) {
					pool.releaseConnection(connection);
					callback(err, taskResult);
				});
			})
		});
	});
};


exports.executeUpdate = function (/*sql, params, callback*/) {
	var _args = arguments;
	pool.getConnection(function (err, connection) {
		var callback = _args[_args.length - 1];
		if (err)return callback(err);

		var args = Array.prototype.slice.call(_args, 0);
		args[args.length - 1] = function (err, results) {
			connection.config.queryFormat = null;
			pool.releaseConnection(connection);
			callback(err, results);
		};
		connection.config.queryFormat = function (query, values) {
			if (!values) return query;
			return query.replace(/\:(\w+)/g, function (txt, key) {
				if (values.hasOwnProperty(key)) {
					return this.escape(values[key]);
				}
				return txt;
			}.bind(this));
		};
		connection.query.apply(connection, args);
	});
};


exports.executeListForPagination = function (sql, params, callback) {
	function tranformResult(err, results) {
		var countResult = (results && results.length > 0) ? results[0][0].count : 0;
		callback(err, {total: countResult, rows: (results[1] ? results[1] : [])});
	}

	var sql_count = "select count(*) as count ";
	var sql_select = sql.split(' from ')[0];
	var sql_where = ' from ' + sql.split(' from ')[1];
	var sql_limit = " limit :offSet, :pageSize";

	var tasks = [];
	tasks.push(function (callback2) {
		exports.executeList((sql_count + sql_where), params, callback2);
	});
	tasks.push(function (callback2) {
		exports.executeList((sql_select + sql_where + sql_limit), params, callback2);
	});

	async.parallel(
			tasks,
			tranformResult
	);
};

exports.execute = function (/*sql, params, callback*/) {
	var _this = this;
	var _args = arguments;
	pool.getConnection(function (err, connection) {
		var args = Array.prototype.slice.call(_args, 0);
		var callback = args[args.length - 1];
		if (typeof(callback) !== "function") {
			callback = function () {

			};
			args.push(callback);
		}

		if (err) {
			return callback(err);
		}

		args[args.length - 1] = function (err2, results) {
			pool.releaseConnection(connection);
			callback(err2, results);
		};
		connection.query.apply(connection, args);
	});
};