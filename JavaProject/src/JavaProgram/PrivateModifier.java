package JavaProgram;

public class PrivateModifier {
private int a=20;
void m1()
{
	System.out.println(a);
}
public static void main(String []args) {
	PrivateModifier d1=new PrivateModifier();
	d1.m1();
}
}
