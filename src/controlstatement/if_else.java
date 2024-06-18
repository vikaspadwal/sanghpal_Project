package controlstatement;

public class if_else {
	
	
	
//	public static void total(float marks) {
//		
//		
//		System.out.println(marks/500*100);
//		
//	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		total(444f);
		
		float totalmarks=600f,marks;
		
		marks=totalmarks/500*100;
		
		System.out.println(marks);
		
		
		
		
		if(marks>=90.00) {
			System.out.println("First class");
			
			
		}
		else if(marks>=80.00 & marks<=90.00) {
			System.out.println("second class");
		}
		
		else if(marks>=70.00 & marks<=80.00) {
			System.out.println("third class");
		}
		
		else if(marks>=35.00 & marks<=60.00) {
			System.out.println("passed");
			
		}
		
		else {
			System.out.println("failed");
		}
		
		
		
		
		
		
		
	}
	
	
	

}
