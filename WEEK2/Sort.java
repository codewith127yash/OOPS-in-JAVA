import java.util.*;
public class Sort
{
	public static void main(String [] args)
	{
		ArrayList <Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList : ");
		int size = in.nextInt();
		for ( int i =0 ;i < size ; i++)
		{
			System.out.print("Enter Element " + (i+1) + " : ");
			int num = in.nextInt();
			list.add(num);
		}
		System.out.println("Original list : " + list );
		Collections.sort(list);
		System.out.print("Sorted List : " + list);
	}
}