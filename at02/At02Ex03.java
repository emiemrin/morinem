package morinem.at02;

import java.util.Scanner;

public class At02Ex03 {

    public static void main(String[] args) {
    String sMot;
    Scanner lecture = new Scanner(System.in);


    System.out.println("Écrire un mot ou une phrase : ");
    sMot = lecture.nextLine();

    sMot = sMot.toUpperCase();

    sMot = sMot.replace("A", "$");

    System.out.println(sMot);

    lecture.close();
    }

}
