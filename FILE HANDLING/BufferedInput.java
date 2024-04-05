import java.io.*;
class BufferedInput
{
	public static void main(String[] args)throws IOException
	{
		int[] A = new int[5]; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		str = br.readLine();
		String[] s = str.split(" ");
		int i=0;
		for(String n:s)
		{
			System.out.println(n);
			A[i] = Integer.parseInt(n);
		}
		for(int m:A)
		{
			System.out.print(m+"  ");
		}
		/*System.out.println("Enter Lines");
		while(!(str = br.readLine()).equals(""))
		{
			System.out.println(str);
		}*/
	}
}

//System.in ---> Input Byte Stream --> Keyboard
//InputStreamReader ist = new InputStreamReader(System.in) ---> Convert bytes to characters
//BufferedReader br = new BufferedReader(ist);