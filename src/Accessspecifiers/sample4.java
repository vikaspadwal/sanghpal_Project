package Accessspecifiers;

public class sample4 {
	
	 public int c;
	
	 public sample4() {
		// TODO Auto-generated constructor stub
		
		c=40;
	}
	
	public void squre2() {
		
		System.out.println(c*c*c*c);
		
	}
	
	public static void main(String[] args) {
		
		sample4 s4=new sample4();
		
		s4.squre2();
		System.out.println(s4.c);
		
	}
	
	
	
	

}
