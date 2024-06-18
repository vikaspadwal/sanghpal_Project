package Array;

import java.util.Arrays;

public class sample
{
	
	public static void main(String[] args)
	{
		
		
		
		int a[]=new int[6];
		
		a[0]=50;
		a[1]=30;
		a[2]=90;
		a[3]=20;
		a[4]=12;
		
//		System.out.println(a.length);
		
		Arrays.sort(a);
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
			
		}
		

		
		
	}

}
