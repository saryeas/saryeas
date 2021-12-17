package javaproject2;

public class PRACTICE {

	public static void main(String[] args) {
		String a = "asdfg";
		int len = a.length();
		String rev = "";
		
		
		for ( int i = len-1; i>=0; i--)
		{
			
		rev = rev + a.charAt(i);
			
		}
        System.out.println(rev);
        
        
        String name [] = {"java","javascript","python","java"};
        
        for( int i =0;i<name.length;i++) {
        	for(int j=i+1;j<name.length;j++){
        		
        		if(name[i].equals(name[j])) {
        			System.out.println("Duplicate value"+ name[i]);
        		}
        	}
        	{
        

        
 }

        }
	}

	private static Object p(int k) {
		// TODO Auto-generated method stub
		return null;
	}}
