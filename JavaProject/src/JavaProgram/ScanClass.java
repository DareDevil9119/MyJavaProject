package JavaProgram;

import java.util.Scanner;

public class ScanClass {
	static int psd;
	public static void main(String[] args) {
        m1();       
	}
	static void m1()
	{
		System.out.print("Enter Password:-");
        Scanner obj = new Scanner(System.in);
        psd = obj.nextInt();
		if (psd == 1505) {
            System.out.println("My Name:= Mukesh Kumar");
            System.out.println("My Age:=25");
            System.out.println("My contact:= 8795150036");
            System.out.println("Emergency contact:8840526966");
            System.out.println(
                    "Parmanent address:- Vill Kutubpur Thanedaar Ka Purwa Post Pura Bazar District Ayodhya UP india 224171");
            System.out.println("My Address:= New Ashok Nagar,New Delhi India 110096");
        }
		else
		{
			m1();
		}
	}
}
