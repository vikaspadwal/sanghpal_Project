package casting;

public class son extends upcasting {
	
	public void Laptop() {
		
		System.out.println("i6 4GB");
		
	}
	
	public void car() {
		
		System.out.println("new car:Ferrari");    // method overriding
		
	}
	
	
	public void money() {
		
		System.out.println("50L");   // method overriding
		
	}
	
	public static void main(String[] args) {
		
		upcasting s=new son();
		s.car();
		s.money();
		s.home();
//		s.Laptop();
	
		
		
		
	}

}
