import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("String: " + str);

        String[] strarr = str.split(" ");
        System.out.println("Sub strings are:");
        for (String s : strarr) {
            System.out.println(s);
        }

        // Reverse the string using iteration
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println("Reverse string:");
        System.out.println(rev.toString());

        // Reverse the string using StringBuffer's reverse method
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String: " + sb);
        System.out.println("Reverse string: " + sb.reverse());

        // Reverse string using StringBuilder's reverse method
        StringBuilder sr = new StringBuilder(str);
        System.out.println("String: " + sr);
        System.out.println("Reverse string: " + sr.reverse());

        // Length vs Capacity demonstration
        System.out.println("Length of str: " + str.length());
        sb = new StringBuffer("");
        System.out.println("Capacity of empty sb: " + sb.capacity());
        sb.append("A");
        System.out.println("Capacity of sb after append: " + sb.capacity()); // Capacity might increase automatically
        sc.close();
    }
    
}
