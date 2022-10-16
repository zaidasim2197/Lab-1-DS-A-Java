package task.no.pkg3;

import java.util.Scanner;

public class TaskNo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email");
        String email = sc.next();

        String userName = email.substring(0, email.indexOf("@"));
        System.out.println("User Name = " + userName);

        email = email.substring(email.indexOf("@") + 1);
        String serverName = email.substring(0, email.indexOf("."));
        System.out.println("Domain = " + serverName);

        String ext = email.substring(email.indexOf(".") + 1);
        System.out.println("Extension = " + ext);
    }

}
