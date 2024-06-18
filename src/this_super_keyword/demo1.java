package this_super_keyword;

public class demo1 extends demo2 {
	int a=10;
	
	public void m1() {
		
		int a=20;
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[] args) {
		
		demo1 d1=new demo1();
		d1.m1();
		
	}
	
	

}
