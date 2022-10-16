
package task1.java;
import java.util.Scanner;
public class Task1Java {
    public static void main(String[] args) {
int tries = 0;
boolean iterated = false;
String temp = "";
String holder = "";
Scanner keyboard = new Scanner (System.in);
System.out.println("Enter Your Secret Word:");
String word = keyboard.nextLine();
do{
    System.out.println("Enter you letter guess");
    String guess = keyboard.nextLine();
    for(int i =0; i<word.length(); i++){
        if(guess.equals(Character.toString(word.charAt(i)))){
            if(!iterated)
                temp += Character.toString(word.charAt(i));
            else{
                holder = Character.toString(temp.charAt(i)).replace("-",guess);
                temp = temp.substring(0,i) + holder + temp.substring(i+1,temp.length());
            }
        }else{
            if(!iterated){
                temp += "-";
            }
        }
    }
    tries ++;
    iterated = true;
    System.out.println(temp);
    if(temp.equals(word)){
        System.out.println("You Guessed Correctly!");
        break;
    }
}while(tries<10);
       
     
    }
    
}
