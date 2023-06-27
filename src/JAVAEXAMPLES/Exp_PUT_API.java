package JAVAEXAMPLES;

import org.apache.poi.openxml4j.opc.internal.ContentType;
import org.asynchttpclient.Response;

public class Exp_PUT_API {
public static void main (String args[]) {
	JSONObject data = new JSONObject();
	data.put("empid","101");
	data.put("empname","suresh.k");
	Response resp = RestAssured.given().contentType(ContentType.JSON).body(data.toJSONString()).put("");
	int statuscode = resp.getStatusCode();
	System.out.println(resp.getTime());
	System.out.println("=======================");
	String data1 = resp.asString();
	System.out.println(data1);
	
}
}
