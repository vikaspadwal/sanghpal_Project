package variable;

public class types_variable {
	
	 static int i=50;     //global variable
	
	
	
	public static void main(String[] args) {
		
		int j=25;  //local variable
		
		System.out.println(j);
		
		
	
		
		
		types_variable obj=new types_variable();
		
		sample2();	
		obj.sample();
		
		
		var obj1=new var();
		System.out.println(obj1.n);
		
		obj1.name();
		
		
		
		
	}
	
	static int m1=5000;
	
	
	public static void sample2() {
		
		int m=33;
		
		
	System.out.println(types_variable.i);
	System.out.println(m);
		
	}
	
	public void sample() {
		
		
		System.out.println(i);
		System.out.println(m1);
		
	}
	
	
	
	
	
	

}
