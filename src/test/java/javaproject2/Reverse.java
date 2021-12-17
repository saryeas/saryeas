package javaproject2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
	
	String s= "ABCDE";
	String rev = "";
	int len= s.length();
	
	for( int i =len-1; i>=0; i--)
	{ 
		rev = rev + s.charAt(i);
	}
	
	System.out.println( rev);
	
	
	
	int num = 12345;
	//reverse variable 
	int r = 0;
	// while number not equal to 0
	while (num !=0)
	{
		r= r*10 + num %10;
		num= num/10;
				
	}
	
	System.out.println (r);
		
	
	int []a = {20,30,40,50,60};
	//storing array index  as 0
	int max =a[0];
	
	//as i stored 0 as first index  now i am going to create for loop to compare one index to other index that why i am taking i value 1 and already i took 0 as maximum value
	
	for(int i = 1; i<a.length;i++)
	{
		
		if (max<a[i]) {
			max=a[i];
		}
		}
		System.out.println(max);
		
	
	}
	
	
	
	
	
	
	
	}




