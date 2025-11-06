package morinem.at01;

import java.util.Scanner;

public class At01Ex01 {
    public static void main(String[] args) {
        
        int Inombre1;
        int Inombre2;
        Scanner lectureNombre = new Scanner(System.in);
        

        System.out.println("Entrer le premier numéro : ");
        Inombre1 = lectureNombre.nextInt();

        System.out.println("Entrer le deuxième numéro : ");
        Inombre2 = lectureNombre.nextInt();

        lectureNombre.close();
        
        if (Inombre1<Inombre2) {
            System.out.println("Le deuxième numéro," + Inombre2 + " est plus grand.");
        }

        else if (Inombre1>Inombre2) {
            System.out.println("Le premier numéro," + Inombre1 + " est plus grand.");
        }

        else{
            System.out.println("Les deux numéros  ont la même valeur.");
        }
    }
}
