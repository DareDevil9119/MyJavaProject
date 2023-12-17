package javaProgram2;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[]xyz) {
		System.out.println("Enter The No.:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		do
		{
			System.out.println("Odd No.: "+(i*2-1));
			i++;
		}
		while(i<=n);
	}

}
