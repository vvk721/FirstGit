package JAVAEXAMPLES;

import org.asynchttpclient.Response;

public class Exp_Delete_API {
public static void main(String args[]) {
	Response resp = RestAssured.delete("");
	int statuscode = resp.getStatusCode();
	System.out.println(ststuscode);
	System.out.println(resp.getTime());
	System.out.println("******************");
	String data = resp.asString();
	System.out.println(data);
}
}
