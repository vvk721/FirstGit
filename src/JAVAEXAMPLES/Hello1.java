package JAVAEXAMPLES;

public class Hello1 {
	public void m1() {
		System.out.println("m1 executed");
	}
	public void m2() {
		System.out.println("m2 executed");
	}
	public void m3() {
		System.out.println("m3 executed");
	}
	public static void main(String args[]) {
		System.out.println("main method executed");
		//class name = new class name();
		Hello1         m    =   new Hello1();
		m.m1();
		m.m3();
		m.m2();
	}

}
