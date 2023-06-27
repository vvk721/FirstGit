package JAVAEXAMPLES;

import org.asynchttpclient.Response;

public class Exp_GET_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Response resp = RestAssured.get("");
int statuscode = resp.getStatusCode();
System.out.println(statuscode);
System.out.println(resp.getTime());
System.out.println("*************************");
String data = resp.asString();
System.out.println(data);
	}

}
