class Arithmetic {
    public static void main(String[] args) {
        int x = 0;
        try 
        {
            x = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("An arithmetic exception occurred ");
        } 
        finally 
        {
            System.out.println("The finally block is executed, regardless of whether an exception is thrown or not.");
            System.out.println("The value of x: " + x);
        }
    }
}