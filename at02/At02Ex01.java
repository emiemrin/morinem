package morinem.at02;

import java.util.Scanner;

public class At02Ex01 {

    public static void main(String[] args) {
    
    String sMot;
    Scanner lecture = new Scanner(System.in);

    System.out.println("Écrire un mot ou une phrase pour le mettre en majuscules : ");
    sMot = lecture.nextLine();

    sMot = sMot.toUpperCase();

    System.out.println(sMot);

    lecture.close();
    }

}
