package String_Class;

public class String_Methods 
{
	public static void main(String[] args)
	{
		String s1="Vikas Padwal";
		String s2="  Vikas raju padwal";
		String s3="";
		String s4="My name is Vikas R Padwal it is good";
		
		
		
		
		
		
//		s1=s1.toUpperCase();
		System.out.println(s1.toLowerCase());     //toLowerCase
		
		
		System.out.println(s2.toUpperCase());     //toUpperCase
		
		System.out.println("String Length count=  "+s2.length());	      //length
		
		System.out.println("Empty String=  "+s3.isEmpty());         //isEmpty
		
		System.out.println("Equals data=  "+s1.equals(s1));			//equals
		
		System.out.println("Ignore Case=   "+s2.equalsIgnoreCase(s2));    //equalsIgnoreCase
		
		System.out.println("Contains String=   "+s4.contains("also"));    //contains
		
		System.out.println("Start with string=    "+s4.startsWith("M"));    //startsWith
		
		System.out.println("Ens with=  "+s4.endsWith("d"));				//endsWith
		
		System.out.println("Concatenate to the string   "+s4.concat(s2));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
