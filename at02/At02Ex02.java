package morinem.at02;

import java.util.Scanner;

public class At02Ex02 {

    public static void main(String[] args) {
    
    String sMot;
    int iLength;
    Scanner lecture = new Scanner(System.in);

    System.out.println("Écrire un mot ou une phrase pour savoir le nombre de caractères : ");
    sMot = lecture.nextLine();

    iLength = sMot.length();

    System.out.println(iLength);

    lecture.close();
    }
}
