package javaProgram2;

import java.util.Scanner;

public class MarksPercet {
	public static void main(String[]args) {
		System.out.println("Enter The No.:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks<=100 &&marks>=60){
			System.out.println("Are You Passed With First Division Marks.");
			
		}
		else if(marks<60 &&marks>=45 ) {
			System.out.println("Are You Passed With Second Division Marks");
		}
		else if(marks<45 &&marks>=33) {
			System.out.println("Are You Passed With Third Division Marks");
		}
		else if(marks<33 && marks>=0) {
			System.out.println("So Sorry Are You Failed !");
		}
		else if(marks>100) {
			System.out.println("Please Enter The Correct Marks!");
			
		}
	}
	

}
