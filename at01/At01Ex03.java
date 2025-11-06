package morinem.at01;

import java.util.Scanner;

public class At01Ex03 {

    public static void main(String[] args) {
    int Iage1;
    int Iage2;
    Scanner lectureAge = new Scanner(System.in);

    System.out.println("Entrer l'âge de la première personne : ");
    Iage1 = lectureAge.nextInt();

    System.out.println("Entrer l'âge de la deuxième personne  :");
    Iage2 = lectureAge.nextInt();

    lectureAge.close();

    System.out.println("Voici la moyenne d'âge =" + ((Iage1+Iage2)/2));
    
    if (Iage1<Iage2) {
        System.out.println("La deuxième personne, âgé de "+ Iage2+" , est plus vieille");
    }

    else if (Iage1>Iage2) {
        System.out.println("La première personne, âgé de "+ Iage1+" , est plus vieille");
    }

    else{
        System.out.println("Les deux personnes ont la même âge.");
    }
}
}
