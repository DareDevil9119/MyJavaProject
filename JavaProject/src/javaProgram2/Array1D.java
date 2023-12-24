package javaProgram2;

public class Array1D {
public static void main(String[]abc) {
	int a[]=new int[5];
	a[0]=1;
	a[1]=3;
	a[2]=4;
	a[3]=8;
	a[4]=6;
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	int []b={10,20,30,40,50};
	for(int i=0;i<5;i++) {
		System.out.println(b[i]);
	}
	int[] c=new int[5];
	c[0]=21;
	c[1]=31;
	c[2]=41;
	c[3]=51;
	c[4]=61;
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	int d[]= {5,15,25,35,45,55,65,75,85,95};
	for(int i=0;i<d.length;i++) {
		System.out.println(d[i]);
	}
}

}
