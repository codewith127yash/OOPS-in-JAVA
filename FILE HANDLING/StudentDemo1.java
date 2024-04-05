import java.io.*;
import java.util.*;

class Student
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
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getDept()
	{
		return dpt;
	}
	public String toString() {
		return "Name: "+name+", Roll No.: "+roll+", Department: "+dpt;
	}
}

class StudentDemo1
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
			students[i]= new Student(name,roll,dpt);
		}
		System.out.println();
		for(Student s : students)
		{
			System.out.println(s);
		}

		try
		{
			PrintWriter pw= new PrintWriter(new FileWriter("text_students.txt"));
            for(Student student : students) {
                pw.println(student);
            }
			pw.close();
			System.out.println("Student objects written to file successfully.");
			
			FileReader fr = new FileReader("text_students.txt");
            BufferedReader br = new BufferedReader(fr);
			String line;
			System.out.println("Student Details:");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
			fr.close();
		}
		catch(IOException e) 
		{
            System.out.println(e.getMessage());
			e.printStackTrace();
		}
        sc.close();
	}
}