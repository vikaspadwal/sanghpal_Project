package Hierarchical_Inheritance;

public class call_obj {
	
	


	public static void main(String[] args) {
		
		// First Son
		
		son1 s1=new son1();
		s1.car();
		s1.money();
		s1.home();
		s1.laptop();
		System.out.println("---------------------------------------");
		
		// Second Son
		
		son2 s2=new son2();
		s2.car();
		s2.money();
		s2.home();
		System.out.println("---------------------------------------");
		
		// Third Son
		
		son3 s3=new son3();
		s3.car();
		s3.money();
		s3.home();
		System.out.println("---------------------------------------");
		
		
		
		
	}

}
