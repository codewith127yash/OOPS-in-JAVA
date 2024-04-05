import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int start = 0;
        while (start < str.length()) {
            int end = start;
            while (end < str.length() && str.charAt(end) != ' ') {
                end++;
            }
            String word = str.substring(start, end);
            int vowels = 0, consonants = 0, i, len;
            len = word.length();
            for (i = 0; i < len; i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println("The number of vowels in the word " + word + " = " + vowels);
            System.out.println("The number of consonants in the word " + word + " = " + consonants);
            start = end + 1;
        }
        in.close();
    }
}