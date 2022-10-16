package task.no.pkg2;

import java.util.Random;

public class TaskNo2 {

    public static void main(String[] args) {
        Random r = new Random();
        String alphabet = "abcedfgihjoxyuzakvfdildsebjaseuadjoajdookoasdreuooqwsadijqojqoejqprqwqcncioasjqwidqiwdjqiwdjjqwjqwdo";
        for (int i = 0; i < 100; i++) {
            char c = Character.toLowerCase(alphabet.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(alphabet.charAt(i)+" ");
            }
        }
    }

}
