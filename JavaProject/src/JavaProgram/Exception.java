package JavaProgram;

public class Exception {
	public static void main(String[]args) {
	  
	{  
		void divide(int a, int b)   
		{  
		int res;  
		try  
		{  
		// performing divison and storing th result  
		res = a / b;  
		System.out.println("Division process has been done successfully.");  
		System.out.println("Result came after division is: " + res);  
		}  
		// handling the exception in the catch block  
		catch(java.lang.ArithmeticException ex)  
		{  
		System.out.println("Should avoid dividing by 0 " + ex);  
		}  
		  