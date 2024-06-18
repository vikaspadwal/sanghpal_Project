package controlstatement;

public class Nested_if {
	
	
	public static void main(String[] args) {
		
		
		int Pre_exam=177;
		int main_exam=900;
		
		
		if (Pre_exam>=300) 
		{
			
			System.out.println("selected for main exam");
			
			
			
			if(main_exam>=800)      // <--- nested /inner 
			{
				System.out.println("passed and selected for IPS");
			}
			
			else 
			{
				System.out.println("failed in main exam ");
			}
			
		}
		
		
		else
			
		{
			System.out.println("not selected for main exam");
		}
		
		
		
	}
	
	
	

}
