package javaProject;

public class Lec8polimorphism {
	
public void method1() {}	

	
	
  static void method2 () {
	System.out.println("nexttech itc");
}
  
  //method overloading same method name and different argument and parameter
  public void method3(int a,double b) {}	
  public void method3(int c,int e) {}	
  public void method3(int x,double y, String c) {}	
  public void singin(String username,String pw) {}	
  public void singin(String username,String pw, String rememberme) {}	
  
  
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
       method2();
	}

}
