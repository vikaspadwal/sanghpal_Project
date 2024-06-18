package Array;

import java.util.Arrays;

public class array_oneline 
{
	
	public static void main(String[] args) 
	{
		int ar[]= {54,78,69,45,78,2,65,22,36,62};
		
		Arrays.sort(ar);
		
		System.out.println("Lowest number"+    ar[0]);
		
		System.out.println("Highest number" +    ar[ar.length-1]);
		
		for(int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		
	}
	
	
	
	
	
	

}
