package javaProgram2;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[]abc ) {
	System.out.println("Enter The No.:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=n) {
		System.out.println("Even No.: "+i*2);
		//System.out.println("Odd No.: "+(i*2-1));
		i++;
	}
}
}
