package Inheritance;

public class Inherit {
void m1() {
	System.out.println("My Name Is Mukesh Kumar");
}
}
 class Inherit1 extends Inherit{
	void m2() {
		System.out.println("Today I Learn About Java");
	}
}
  class Inherit2 extends Inherit {
	 void m3() {
	 	System.out.println("THis Is a First class of Java");
	 }
	 }
   class Inherit3 extends Inherit {
	  void m4() {
	  	System.out.println("This class is over");
	  }
   }
	  public class M{
	  public static void main(String[]args) {
		  
	  	Inherit3 I=new Inherit3();
	  	I.m1();
	  	I.m4();
	  	
	  }
	  }
	  
