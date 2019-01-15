package Server;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * ������
 * @author TIan
 *
 */
public class ServletContext {
//	Ϊÿһ�� Servlet ��������
//	login --> LoginServlet
	private Map<String, String> servlet;
//	url --> login
	private Map<String,String> mapping;
	
	
	public ServletContext() {
		servlet = new HashMap<String,String>();
		mapping = new HashMap<String,String>();
	}
	
	public Map<String, String> getServlet() {
		return servlet;
	}
	public void setServlet(Map<String, String> servlet) {
		this.servlet = servlet;
	}
	public Map<String, String> getMapping() {
		return mapping;
	}
	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}
	
}
