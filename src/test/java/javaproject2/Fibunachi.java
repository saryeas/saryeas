package javaproject2;

public class Fibunachi {

	public static void main(String[] args) {
		int a= 1;
		int b=3;
		System.out.println("print" +(a+b));
		
		
		int k=2;
		k++;
		System.out.println("print" +(k));
		
		int c=2;
		c--;
		System.out.println("print" +(c));
		
		int s=10;
		int r=20;
		int t=s;
		s=r;
		r=t;
		//r=s+r-(s=r);
		System.out.println ("Afrter swapping....." +s+"   "+r);
		
	}

}
