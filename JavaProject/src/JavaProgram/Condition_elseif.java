package JavaProgram;

import java.util.Scanner;

 class Condition_elseif {
	public static void main(String[] args) 
	{
		int marks;
		System.out.println("Enter Marks");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=60 && marks<=100);
		{
		System.out.println("First Devision");	
		}
		 if (marks<=60 && marks>=45);
		{
		System.out.println("Second Devision");	
		}
		 if (marks<=45&&marks>=30);
		{
			System.out.println("Third Division");
		}
		 if(marks<30 && marks>=0);
		{
		System.out.println("Failed");	
		}
	}

}
