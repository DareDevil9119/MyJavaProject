package javaProgram2;
// Method OverLoading
public class Polymorphism {
	void m1() {
		System.out.println("Hello Today is a Java Class ");
	}
	void m1(String a) {
		System.out.println(a);
		
	}
	void m1(int a) {
		System.out.println("Natural No.");
	}
	void m1(String a,int b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	void m1(int a, float b) {
		System.out.println(a);
		System.out.println(b);
	}
	void m1(String a,String b) {
		
	}
	public static void main(String[]abc) {
		Polymorphism p=new Polymorphism();
		p.m1();
		p.m1("Today I am learn about Number System");
		p.m1(123);
		p.m1(32, 9800);
		p.m1("Mukesh Kumar", 31);
		
	}

}
