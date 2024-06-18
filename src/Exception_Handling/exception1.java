package Exception_Handling;

public class exception1 {
	
	
	
	public static void main(String[] args) {
		
		String str[]= {"vikas","akash","rupali"};
//		System.out.println(str[4]);
//		
		
		try 
		{
		
		System.out.println(str[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Exception Handling");
			
		}
		
		System.out.println("hello running" );
		
		
		
	}
	
	
	
	
	
	

}
