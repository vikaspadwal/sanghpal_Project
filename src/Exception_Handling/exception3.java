package Exception_Handling;

public class exception3 


{

	public static void main(String[] args) {
		
		String str="Vikas";
		
		String s1="padwal";		
		
		int ar[]= {10,52,0,14,25,48,56};	
		
		
		
		
		
		
		try {
			System.out.println(ar[9]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array exception solve");
		}
			
			
		
		
		
		try 
		{
			
		System.out.println(str.charAt(2));
				
		}
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("String exception solve");
		}
	
		
		
		
		
		try 
		{
			
		System.out.println(s1.charAt(10));
		
		}
		
		
		
	
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("string exception solve");
		}
		
		
		
		
		
		
		
		
		System.out.println("String length "+str.length());
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
