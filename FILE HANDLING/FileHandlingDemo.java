import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
       /*   //Creating a file
        File myfile = new File("newFile.txt");
        try 
        {
            myfile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        // Writing to a file 
        try{
        FileWriter fileWriter = new FileWriter("newFile.txt");
        fileWriter.write("This is the first file form java course");
        fileWriter.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        //Reading a file
        File myFile = new File("newFile.txt");
        try 
        {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } 
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }*/
        //Deleting a file 
        File myfile = new File("newFile.txt");
        if (myfile.delete()) 
        {
               System.out.println("I have Deleted " + myfile.getName());
        }
        else
        {
            System.out.println("Some problem has occurred while deleting the file");
        }
    }
}
