import java.util.Scanner;

public class ElementOccurrenceCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter " + size + " integers separated by spaces: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }


        boolean[] counted = new boolean[size];

        for (int i = 0; i < size; i++) {

            if (counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;

                    counted[j] = true;
                }
            }

            
            if (count > 1) {
                System.out.println(numbers[i] + ": " + count);
            }

            counted[i] = true;
        }
    }
}
