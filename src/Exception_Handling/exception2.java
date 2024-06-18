package Exception_Handling;

public class exception2 {
	
	
	public static void main(String[] args) {
		
		int div = 0, num1=10,
		    num2=0;
		
		try
		{
		div=num1/num2;
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception hondling");
		}
		
		System.out.println(div);
		
		
		
		
		
	}

}
