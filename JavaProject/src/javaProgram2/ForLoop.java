package javaProgram2;

import java.util.Scanner;

public class ForLoop {
public static void main(String[]args) {
	System.out.println("Enter The No.:");
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	
	for(int i=1;i<=20;i++) {
		
		System.out.println(n+"*"+i+"="+(i*n));
}
}
}
