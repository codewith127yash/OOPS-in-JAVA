class ExceptionHandling
{
	public static void main(String args[] ) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e ) 
		{
			//System.out.println(e);
			//internally toString is called automatically
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("Normal Termination");
	}
}