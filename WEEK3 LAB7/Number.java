import java.util.Scanner;
public class Number 
{
    public static void check(int num) 
    {
        if (num < 0) 
        {
            throw new ArithmeticException("NegativeNumberException : number should be positive ");
        } 
        else 
        {
            System.out.println(num * 2);
        }
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        try 
        {
            check(n);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught the exception : " + e.getMessage());
        }
        in.close();
    }
}