package interface_implements;

public class call_inteface implements inteface,interface2,inerface3 {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("running interface implements m1");
		
	}

	public void m2() {
		System.out.println("running interface implements m2");
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		call_inteface c=new call_inteface();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		System.out.println(c.a);
		
	}

	public void m3() {
		// multiple inheritance
		System.out.println("multiple inheritance m3");
		
		
	}

	public void m4() {
		System.out.println("multiple inheritance m4");
		// multiple inheritance
		
	}

	public void m5() {
		// TODO Auto-generated method stub
		
		System.out.println("method numbe 5");
		
	}
	
	
	
	
	

}
