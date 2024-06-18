package constructor;

public class sample {
	
	int num1;
	int num2;
	
	sample(int a,int b){   // user define constructor with parameter
		
		num1=a;
		num2=b;
		
		
	}
	
	public void m1() {
		
		
		
		
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		
	}
	
	public static void main(String[] args) {
		
		sample s1=new sample(200,500);  //parameter
		s1.m1();
		
		sample s2=new sample(45,78);	//parameter
		s2.m1();
		
		sample s3=new sample(69,45);	//parameter
		s3.m1();
		
		
		
		
	}
	
	
	
	
	
	

}
