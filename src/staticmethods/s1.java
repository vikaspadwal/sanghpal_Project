package staticmethods;

public class s1 {
	
	
	//static method
	
	public static void m() {
		
		System.out.println("static methods");
		
		
		
	}
	
	public static void main(String[] args) {
		
		m();
		Non_static.method();
		
		s1 obj=new s1();
		obj.m2();
		
		
		//non static method call in other classes
		Non_static obj1 =new Non_static();
		
		obj1.sample();
		
		
		
		
		
	}
	
	//Non-static method
	
public void m2() {
		
		System.out.println("Non static methods");
		
		
		
	}
	
	

}
