import java.util.Scanner;

class ArrayIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array  = ");
        int n = in.nextInt();
        int arr[] = new int[n];
        try {
            for(int i = 0 ; i <= n ; i ++ ) {
                System.out.print("Enter the element " + (i+1) + "= ");
                arr[i] = in.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException:"+e);
        }
        in.close();
    }
}