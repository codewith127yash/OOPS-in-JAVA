import java.util.Scanner;

public class HandlingString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Change Case\nEnter 2 for Reverse\nEnter 3 for Compare\nEnter 4 for insert\nEnter 5 for conversion from upper to lower case\nEnter 6 for check character present or not\nEnter 7 for Palindrome\nEnter 8 for number of words, vowel and consonant in the string:");
        System.out.println("Enter your choice : ");
        int choice = in.nextInt();
        in.nextLine(); 

        System.out.println("Enter the first String : ");
        String str1 = in.nextLine();
        String str2 = ""; 

        String w = "";

        char ch;

        int len = str1.length();
        int i, count = 0, store = 0;

        switch (choice) {
            case 1:
                System.out.println("The String in Upper Case : ");
                System.out.println(str1.toUpperCase());
                System.out.println("The String in Lower Case : ");
                System.out.println(str1.toLowerCase());
                break;

            case 2:
                for (i = len - 1; i >= 0; i--) {
                    ch = str1.charAt(i);
                    w = w + ch;
                }
                System.out.println("Reversed String = " + w);
                break;

            case 3:
                System.out.println("Enter the second String : "); 
                str2 = in.nextLine();
                if (str1.equalsIgnoreCase(str2))
                    System.out.println("The Strings are equal ");
                else
                    System.out.println("The Strings are not equal ");
                break;

            case 4:
                str2 = str1; 
                System.out.println("The value of str1 = " + str1);
                break;

            case 5:
                System.out.println("The string is converted to Lower Case  : " + str1.toLowerCase());
                break;

            case 6:
                System.out.print("Enter the character =");
                ch = in.next().charAt(0);
                for (i = 0; i < len; i++) {
                    if (str1.charAt(i) == ch)
                        count++;
                    store = i;
                }
                if (count >= 1)
                    System.out.println("The character is found at  " + store);
                else
                    System.out.println("The character is not found");
                break;

            case 7:
                for (i = len - 1; i >= 0; i--) { // Corrected loop condition
                    ch = str1.charAt(i);
                    w = w + ch;
                }
                if (w.equalsIgnoreCase(str1))
                    System.out.println("The String is Palindrome : ");
                else
                    System.out.println("The String is not palindrome : ");
                break;

            case 8:
                int vCount = 0, cCount = 0;
                str1 = str1.toLowerCase();

                for (i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
                            || str1.charAt(i) == 'u') {
                        vCount++;
                    } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                        cCount++;
                    }
                }
                System.out.println("Number of vowels: " + vCount);
                System.out.println("Number of consonants: " + cCount);

                int wordCount = 0;

                for (i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) == ' ' && Character.isLetter(str1.charAt(i + 1)) && (i > 0)) {
                        wordCount++;
                    }
                }
                wordCount++;
                System.out.println("Total number of words in the given string: " + wordCount);
                break;

            default:
                System.out.println("Wrong choice ");
        }
        in.close();
    }
}
