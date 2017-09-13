package xzh_2017_6_7;
import java.io.BufferedReader;
import net.sf.json.*;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GetWebContent {
	public static String getWebCon(String domain) {
		// System.out.println("开始读取内容...("+domain+")");
		StringBuffer sb = new StringBuffer();
		try {
			java.net.URL url = new java.net.URL(domain);
			BufferedReader in = new BufferedReader(new InputStreamReader(url
					.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
			in.close();
		} catch (Exception e) { // Report any errors that arise
			sb.append(e.toString());
		}
		return sb.toString();
	}
	public static String toJsonString(String str){
		return "{" + str.substring(1, str.length()-1) + "}";
	}
	public static Map<String, String> dataAna(String str){
		String key = "";
		String value = "";
		String[] arr = str.split(":");
		key = arr[0].replace(" ", "");
		value = arr[1].replace(" ", "");
		Map<String,String> map_data = new HashMap<String,String>();
		map_data.put(key, value);
		return map_data;
	}
	public static void main(String[] args) {
		String id = "";
		String pw = "";
		Scanner input = new Scanner(System.in);
		System.out.print("username:");
		id = input.next();
		System.out.print("password:");
		pw = input.next();
		String page_data = getWebCon("http://ouryust.jlqlkj.cn/chengjiapi?userid="+id+"&password="+pw).replaceAll("&#39;", "");

		String newString = toJsonString(page_data);
		System.out.println(newString);
		JSONObject jsStr = JSONObject.fromObject(newString);
//		System.out.println(jsStr);
	}
}