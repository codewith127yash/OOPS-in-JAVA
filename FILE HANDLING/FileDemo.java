import java.io.File;
import java.io.IOException;

class FileDemo
{
	public static void main(String[] args)
	{
		try 
		{
			File f = new File("iris.csv");
			if (f.createNewFile()) 
			{
				System.out.println("New File created!");
			} 
			else 
			{
				System.out.println("The file already exists.");
			}
			// apply File class methods on File object
			System.out.println("File name :" + f.getName());
			System.out.println("Path: " + f.getPath());
			System.out.println("Absolute path: "
                           + f.getAbsolutePath());
			System.out.println("Parent: " + f.getParent());
			System.out.println("Exists: " + f.exists());
		
			//flag the file to be read-only
			boolean flag = f.setReadOnly();
			System.out.println("Is File is read-only ? : "
							+ flag);
		
			if (f.exists()) 
			{
				System.out.println("Is writable: "
                               + f.canWrite());
				System.out.println("Is readable: " + f.canRead());
				System.out.println("Is a directory: "
                               + f.isDirectory());
				System.out.println("File Size in bytes: "
                               + f.length());
			}
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}