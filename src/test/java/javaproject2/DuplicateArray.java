package javaproject2;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","c++","python","java"};
		
		
		HashSet<String>langs=new HashSet();
		
		boolean flag= false;
		
		for(String l:arr)
		{
		if(langs.add(l)==false)
			
		{System.out.println("Found duplicate Element:"+ l);
		
		flag=true;
		}
		
		}
	if(flag=false)
	{  {System.out.println("not Found duplicate Element");
		
		}
	}


	}

}