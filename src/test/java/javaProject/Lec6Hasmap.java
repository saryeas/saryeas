package javaProject;

import java.util.HashMap;

public class Lec6Hasmap {

public static void main(String[] args) {
// code for hash map
//Hashmap <datatype1(key/Index) ,datatype2(value)> variable name=new 
	//(new is a key word actually we are creating object of hasmap)//Hashmap <datatype1(key/Index) ,datatype2(value)> variable name
HashMap<Integer,String> country=new HashMap<Integer,String>();
country.put(1, "Bangladesh");
country.put(2, "In");
country.put(3, "USA");
country.put(4, "Pakistan");

//print all the values
System.out.println("total countries"+ country);

// access one values Usa
//always access through key  and  use get method
System.out.println(country.get(3));

//mint 57 liseten for quse

//store value city and country name
HashMap<String,String> country1=new HashMap<String,String>();

country1.put("Dhaka", "Bangladesh");
country1.put("Delhi", "In");
country1.put("ohio", "USA");
country1.put("Lahor", "Pakistan");

System.out.println(country1);

//To get the size
country1.size();
System.out.println(country1.size());

//print key
for (String i : country1.keySet()) {
 System.out.println(i);
}
 for (String j : country1.values()) {
  System.out.println(j);
  }
 
 //print keys and values
 for (String i : country1.keySet()) {
	 System.out.println("key:"+i+"value"+country1.get(i));
 }

 
 


	}

}
