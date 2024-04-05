public class StringReverse 
{
	public static void main(String args[]) 
	{
		String str = "University";
		String reverse = reverseString(str);
		System.out.printf("Actual Word: %s, Word after reversing %s", str, reverse);
	}

	public static String reverseString(String source) 
	{
		if (source == null || source.isEmpty()) 
		{
			return source;
		}

		char[] chars = source.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) 
		{
			reverse.append(chars[i]);
		}
		return reverse.toString();
	}
}