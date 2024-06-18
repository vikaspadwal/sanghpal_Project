package polymorphism;

public class Runtime_call extends Runtime_polymorphism {
	
	public void car() {
		System.out.println("Method over riding car");
		
	}
	
	public static void main(String[] args) 
	
	{
		Runtime_call r= new Runtime_call();
		r.bike();
		r.car();
	}
	
	
	

}
