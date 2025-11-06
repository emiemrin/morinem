package morinem.at01;

import java.util.Scanner;

public class At01Ex02 {

    public static void main(String[] args) {
        int Isalaire;
        int Iheure;
        Scanner lectureNombre = new Scanner(System.in);

        System.out.println("Entrer le taux horaire : ");
        Isalaire = lectureNombre.nextInt();

        System.out.println("Entrer le nombre d'heure par semaine : ");
        Iheure = lectureNombre.nextInt();

        System.out.println("Voici votre paye bimensuel : " + ((Isalaire*Iheure)*2) + "$.");
        lectureNombre.close();
    }
}
