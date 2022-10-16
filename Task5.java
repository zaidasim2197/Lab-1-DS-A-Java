package task.pkg5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String a, reverseStr = "";
        Scanner str1 = new Scanner(System.in);
        System.out.println("Zaid Enter a Word");
        a = str1.nextLine();
        int strLength = a.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + a.charAt(i);
        }
        if (a.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
