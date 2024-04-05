class StringCompareDemo
{
	public static void main(String[] args)
	{
		String st1 = "Hello";
		String st2 = "Hello";
		
		String st3 = new String("Hello");
		String st4 = new String("Hello");
		String st5 = new String("hello");
		
		if(st1 == st2)
		{
			System.out.println("Two strings are equal");
			System.out.println(st1.hashCode());
			System.out.println(st2.hashCode());
		}
		else 
			System.out.println("Two strings are not equal");
		
		//equals() method checks whether 
		//the character sequence and character case 
		//(upper or lower) are same or different, 
		//when invoked by String objects.
		
		if(st1.equals(st2))
		{
			System.out.println("Two strings are equal");
			System.out.println(st1.hashCode());
			System.out.println(st2.hashCode());
		}
		else 
			System.out.println("Two strings are not equal");
		
		if(st1 == st3)
			System.out.println("Two strings are equal");
		else 
			System.out.println("Two strings are not equal");
		
		if(st1.equals(st3))
		{
			System.out.println("Two strings are equal");
			System.out.println(st1.hashCode());
			System.out.println(st3.hashCode());
		}
		else 
			System.out.println("Two strings are not equal");
		
		if(st3 == st4)
			System.out.println("Two strings are equal");
		else 
			System.out.println("Two strings are not equal");
		
		if(st3.equals(st4))
		{
			System.out.println("Two strings are equal");
			System.out.println(st3.hashCode());
			System.out.println(st4.hashCode());
		}
		else 
			System.out.println("Two strings are not equal");
		
		
		if(st4.equalsIgnoreCase(st5))
			System.out.println("Two strings are equal");
		else 
			System.out.println("Two strings are not equal");
		
		//The String class compareTo() method compares values lexicographically 
		//and returns an integer value that describes if first string is less than, 
		//equal to or greater than second string.  
		
		if(st1.compareTo(st2) == 0)
			System.out.println("Two strings are equal");
		else 
			System.out.println("Two strings are not equal");
		
		if(st5.compareTo(st4) > 0)
			System.out.println("First string is greater than second string");
		else if(st4.compareTo(st5) < 0)
			System.out.println("Second string is greater than first string");
		else 
			System.out.println("Two strings are equal");
	}
}
