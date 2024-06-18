package static_nonstatic;

public class multiple {
	
	int num,num2,num3;
	String name,empname;
	
	
	multiple(int n,int n2){
		
		num=n;
		num2=n2;
		
	}
	multiple(String nam){
		
		name=nam;
		
	}
	
	multiple(int x,String emp1){
		
		num3=x;
		empname=emp1;
		
		
	}
	
	public void m1() {
		
		System.out.println(num*num2);
		
		
	}
	
	public void m2() {
		
		System.out.println(name);
		
		
	}
	
	public void m3() {
		
		System.out.println(empname+':'+num3);
		
	}
	
	public static void main(String[] args) {
		
		multiple obj=new multiple(15,25);
		multiple obj2=new multiple("vikas");
		
		multiple obj3=new multiple(551998,"vikas raju padwal");
		
		obj.m1();
		obj2.m2();
		obj3.m3();
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
