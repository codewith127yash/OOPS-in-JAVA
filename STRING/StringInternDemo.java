public class StringInternDemo
{
	public static void main(String[] args)
	{
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = s1.intern();
		if(s1 == s2)
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are not equal");
		
		if(s1 == s3)
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are not equal");
		
		System.out.println(s1.intern());
		
		s1 = new String("Hello").intern();
		s2 = new String("Hello").intern();
		if(s1 == s2)
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are not equal");
	}
}