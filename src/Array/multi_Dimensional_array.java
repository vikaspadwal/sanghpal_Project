package Array;

import java.util.Arrays;

public class multi_Dimensional_array {
	
	public static void main(String[] args) {
		
		int ar[][]= {{10,45,78},{78,45,69}};
		
		
//		Arrays.sort(ar);
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++) {
				
				System.out.print(""+ar[i][j]);
			}
			System.out.println("");
			
		}
		
		
		
		
	}

}
