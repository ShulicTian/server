package Servlet;

import Server.Request;
import Server.Response;

public class LoginWeb extends Servlet {

	@Override
	public void doGet(Request req, Response res) throws Exception {
		res.println("��ӭ���룡");
	}

	@Override
	public void doPost(Request req, Response res) throws Exception {
		
	}

}
