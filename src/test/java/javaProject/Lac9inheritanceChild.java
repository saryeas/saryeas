package javaProject;

public class Lac9inheritanceChild  extends Lac9inheritanceparent {

public void method1() {
	Lac9inheritanceChild child = new Lac9inheritanceChild () ; // object of child class
	child.account();
}
	
	
	public static void main(String[] args) {
		
		Lac9inheritanceChild child = new Lac9inheritanceChild () ;
		child.account();
		child.singin();
	}

}
