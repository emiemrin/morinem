package morinem.at02;

import java.util.Scanner;

public class At02Ex04 {

     public static void main(String[] args) {

        double dValeur;
        Scanner lecture = new Scanner(System.in);

        do {
            System.out.println("Entrer un numéro entre 0 et 100 : ");
            dValeur = lecture.nextDouble();
        } while (dValeur>100 || dValeur<0);
            
        lecture.close();

     }

}
