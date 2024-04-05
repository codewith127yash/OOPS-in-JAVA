import java.util.*;
public class LargestThree
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Three Numbers : " ) ;
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int greatest =0;
		if(a>b&&a>c)
			greatest = a;
		else if(b>a && b>c)
			greatest = b;
		else
			greatest = c;
		System.out.println(greatest + " is greatest among three numbers .");
	}
}