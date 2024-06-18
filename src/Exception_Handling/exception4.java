package Exception_Handling;

public class exception4 {
	
	
	public static void main(String[] args) {
		
		String s[]= {"vikas","sky","viks"};
		
		try {
		
		System.out.println(s[4]);
		}
		catch (Exception e) 
		{
			System.out.println("Handle man");
			e.printStackTrace();
		}
		
		
		
		
	}

}
