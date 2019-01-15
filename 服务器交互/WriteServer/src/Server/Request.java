package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Request {

	private String method;
	private String url;
	private Map<String,List<String>> mapValues;
	
	public static final String CRLF="\r\n";
	private InputStream is;
	private String result;
	
	public Request() {
		method = "";
		url = "";
		mapValues = new HashMap<String,List<String>>();
		result = "";
	}

	public Request(InputStream is) {
		this();
		this.is = is;
		try {
			byte[] data = new byte[20480];
			int len = is.read(data);
			result = new String(data,0,len);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		parseResult();
		
	}
	private void parseResult(){
		if(null==result || (result=result.trim()).equals("")){
			return;
		}
//		����ʽ    ����·��    �������
		String paramString="";//�����������
		
		String firstLine = result.substring(0, result.indexOf(CRLF));//��ȡ��һ��
		int idx = result.indexOf("/");
		this.method = firstLine.substring(0,idx).trim();
		String urlStr = firstLine.substring(idx,firstLine.indexOf("HTTP/")).trim();
		if(this.method.equalsIgnoreCase("post")){	
			this.url = urlStr;
			paramString = result.substring(result.lastIndexOf(CRLF)).trim();
			
		}else if(this.method.equalsIgnoreCase("get")){
			
			if(urlStr.contains("?")){
				String[] urlArr = urlStr.split("\\?");
				this.url = urlArr[0];
				paramString = urlArr[1];
			}else{
				this.url = urlStr;
			}
			
		}
		if(paramString.equals("")){
			return;
		}
		packParam(paramString);
	}
//	�������������Map
	private void packParam(String paramString){
//		�ָ�
		StringTokenizer token = new StringTokenizer(paramString,"&");
		
		while(token.hasMoreTokens()){//���Ժ����Ƿ��� &
			String keyValue = token.nextToken();
			String[] keyValues = keyValue.split("=");
			if(keyValues.length == 1){
				keyValues = Arrays.copyOf(keyValues,2);
				keyValues[1] = null;
			}
//			ת����Map
			String key = keyValues[0].trim();
			String value = null==keyValues[1]?null:decode(keyValues[1].trim(),"GBK");
			
			if(!mapValues.containsKey(key)){
				mapValues.put(key,new ArrayList<String>());
			}
			
			List<String> values = mapValues.get(key);
			values.add(value);
		}
		
	}
//	����û�����������
	private String decode(String value,String code){
		try {
			return java.net.URLDecoder.decode(value,code);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	����ҳ���name ��ȡ��Ӧ��ֵ
	public String[] getWebNames(String name){
		List<String> values = null;
		if((values=mapValues.get(name))==null){
			return null;
		}else{
			return values.toArray(new String[0]);
		}
	}
	
	public String getWebName(String name){
		String[] values = getWebNames(name);
		if(null == values){
			return null;
		}
		return values[0];
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
