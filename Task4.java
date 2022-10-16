package task.pkg4;
import java.util.Scanner;
public class Task4 {
   public static void main(String []args) {
        System.out.print("Enter a character: ");
        Scanner s = new Scanner(System.in);
      String s1 = s.nextLine();
      for(int i=0; i < s1.length(); i++) {
         Boolean flag = Character.isDigit(s1.charAt(i));
         Boolean flag1 = Character.isUpperCase(s1.charAt(i));
         Boolean flag2 = Character.isLowerCase(s1.charAt(i));
         if(flag) {
            System.out.println("'"+ s1.charAt(i)+"' is a number");}
          if(flag1) {
            System.out.println("'"+ s1.charAt(i)+"' is a UpperCase Alphabet");}
           if(flag2) {
            System.out.println("'"+ s1.charAt(i)+"' is a LowerCase Alphabet");
         }}}}
