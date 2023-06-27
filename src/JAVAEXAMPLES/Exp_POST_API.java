package JAVAEXAMPLES;

import org.asynchttpclient.Response;

public class Exp_POST_API {
public static void main(String args[]) {
	JSONObject data = new JSONObject ();
	data.put("empid","101");
	data.put("empname","suresh");
	Response resp = RestAssured.given().
			contentType(ContentType.JSON).
			body(data.toJSONString()).
			post("");
	int statuscode = resp.getStatusCode();
	System.out.println(statuscode);
	System.out.println(resp.getTime());
	System.out.println("====================");
	String data1 = resp.asString();
	System.out.println(data1);
}
}
