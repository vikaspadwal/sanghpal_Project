package Accessspecifiers;

public class sample1
{
	private int a;
	
	private sample1()
	{
		a=20;
		
		
	}
	
	private void squre() {
		
		System.out.println(a*a);
	
	}
	
	public static void main(String[] args) {
		
		
		sample1 s1=new sample1();
		
		s1.squre();
		System.out.println(s1.a);
		
		sample4 s4=new sample4();
		
		s4.squre2();
		System.out.println(s4.c);
		
			
			
		
		
	}
	
	
	
	
	
	

}
