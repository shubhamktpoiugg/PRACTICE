package trail;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//LinkedHashSet a=new LinkedHashSet();

 String s="shubham,kailas,patil";

	System.out.println(s.length());
	
	String[] ss=    s.split(",");
	
	for(String q:ss)
	{
		System.out.println(q);
	}
	System.out.println(ss[0]);
	
	

		
		String name1="shubham";
		char ch=name1.charAt(4);//returns the char value at the 4th index
		System.out.println(ch);

		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2));//0 because both are equal
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
	
		
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello")); 
		
		
	}
 
}
