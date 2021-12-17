package javaproject2;
public class Arrayprec {

	public static void main(String[] args) {
		//Array declear and inisialize, Arrey index start from 0 but never negetive always positive
		// arrey variable insializs value
	
		/*int [] array = new int[4];

		array[0] = 5;
		array[1] = 15;
		array[2] = 12;
		array[3] = 8;
		System.out.println(array[2]);
		// array length; length is property,len veriable store size
		int len = array.length;
		System.out.println(len);
		
		//sum
		
		int sum = array[0]+array[1]+array[2]+array[3];
		System.out.println("sum="  +sum);*/

		
		
		
		
		//i will create another veriable make it as 0 inishialy
		
		// now i will write loop which repeat multiple times depends number of values 
		//a of 1 means 2 will retrive and 2 will added to the xisting value inside the some
		//priviously some contains 5 now it will add 2 = sum 7, again it will go up i++ index is increasing  to 3 again the condition is true
		/*for(int i=0;i<=a.length-1;i++){
			
			sum=sum+a[i];
		}

         System.out.println("the sum is " + sum);
		
         int avg = sum/ a.length;
		*/
		
		//enhench loop
		int a[] = {4,5,6,7,8};
		int sum =0;
		//a 4 assinge to value
		for(int value:a)
		{
			sum= sum+ value;
		}
		
         System.out.println( sum);
         
         for(int i =0; i<a.length; i++)
         {
        	 
        	if(a[i]%2==0)
        	 System.out.println(a[i]);
        	 
         }
         
        
       
 		
		
	}









}
