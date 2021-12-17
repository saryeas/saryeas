package javaProject;

public class Lec3forloop {

	public static void main(String[] args) {
		// for loop print 0 to 9
		//Int i= 0  means the requirement is whole number 
//syntex explain : started int i equal 0,then i smaller then 10 and i increment by 1 , ++ means 1, i<=9 (i equal 9) and i<10 (i less then 10) same meaning
		
		for (int i = 0; i <10; i++) {
			System.out.println (i);
			}
		
		
		// for loop print 0 to 15
		for (int j = 0; j <= 15; j++) {
			System.out.println (j);
		}
		// print value 0 to 15.5
		for (double j = 0.5; j <= 15.5; j++) {
			System.out.println (j);
			
		}
		//input value 2 to 20
		for (int j = 2; j <= 20; j++) {
			System.out.println (j);
		}
		
		//print all even number value 2 to 20
				for (int j = 2; j <= 20;j=j+2) {
					System.out.println (j);
				}
				//print all odd number value 2 to 20
				for (int j = 3; j <20;j=j+2) {
					System.out.println (j);
				}
				
				//print all odd number value 2 to 20
				for (int j = 3; j <20; j+=2) {
					System.out.println (j);
				}
				
				
				for (double j = 18.5; j <= 20; j++) {
					System.out.println (j);
			}
				
				
				
				for (int j = 3; j <= 30; j=j+3) {
					System.out.println (j);
			}
		
	}
}
