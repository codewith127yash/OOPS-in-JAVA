import java.io.*;
import java.util.*;

class Student implements Serializable
{
	private String name;
	private int roll;
	private String dpt;
	Student(String name, int roll, String dpt)
	{
		this.name = name;
		this.roll = roll;
		this.dpt = dpt;
	}
	public String toString() {
        return "Name: " + name + ", Roll No.: " + roll + ", Department: " + dpt;
    }
}

class StudentDemo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter student details:");
			System.out.print("Enter student name: ");
			String name = sc.nextLine();
			System.out.print("Enter student roll no.: ");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter student department: ");
			String dpt = sc.nextLine();
			students[i] = new Student(name,roll,dpt);
		}
		System.out.println();
		for(Student s : students)
		{
			System.out.println(s);
		}

		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("students.txt"));
            os.writeObject(students);
			os.close();
			System.out.println("Student objects written to file successfully.");
			
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream("students.txt"));
			Student[] s = (Student[])objin.readObject();
			objin.close();
			System.out.println("Student Details:");
			for (Student std : s) 
			{
                System.out.println(std);
            }
		}
		catch(IOException | ClassNotFoundException e) 
		{
            System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}