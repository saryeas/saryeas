package javaProject;

import java.util.ArrayList;

public class Lec5Arraylistfoorloop {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>(); 
		
		cars.add("Nissan");
		cars.add("BMW");
		cars.add("TOYOTA");
		cars.add("VOLVO");
		System.out.println("we have available"+cars);
		
// Create an ArrayList object
// ArrayList<datatype> variable= new (is key word to create an object)Arraylist<datatype>();
// now i have to import java util package /library, datatype could be integer or string  dependes on value, if my data is whole number we use integer ,
//but if data is string value we use string , mostly we use string because we do not know what type of data we are going to input ,
//it could be decimel value, cha, whole number, alpha, numeric value // string can take every value, why? because we use dubble code/cotetion
// string use as datatype, but if we know what data type we using for example the numbers like year 19 to 2020 then we gonna add 2021 
//its not array anymore arraylist, year is  whole number so we use integer //we use string when we have confusion about data type spacially pasword 
// for month we can use array because its fixed 12 month
// array list we are using because we are storing data
		
		
		//for get access array list item  cars.get method ;
		cars.get(2);
		System.out.println(cars.get(2));
		
		
		//To modify an element, use the set() method and refer to the index number
		cars.set(0, "Bentley");
		
		
		
ArrayList<Integer> year=new ArrayList<Integer>();
year.add(2015);
year.add(2016);
year.add(2017);
year.add(2018);
year.add(2020);

for(int i=0;i<year.size(); i++)
{System.out.println(year.get(i));}

// print 2015,2017,2020

for(int i=0;i<year.size(); i=2+i)
{System.out.println(year.get(i));}



	
	
	
	
	    }



	}


