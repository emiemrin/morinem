package morinem.TP1;

import java.util.*;

public class Tp1Ex4 {

    public static void main(String[] args) {
        String[] tableauFruit = new String[5];
        Scanner lectureFruit = new Scanner(System.in);

        for(int i=0; i<tableauFruit.length;i++){
            System.out.println("Entrer un nom de fruit : ");
            tableauFruit[i] = lectureFruit.nextLine();
        }

        lectureFruit.close();

        nouveauTableau(tableauFruit);
    }

    public static String[] nouveauTableau(String[] tableauFruit){
        int iQuantite;
        Scanner lecture = new Scanner(System.in);
        

        System.out.println("Combien de noms voulez-vous ajouter?");
        iQuantite = lecture.nextInt();
 
        iQuantite = iQuantite+5;

        String[] tableauNouveau = new String[iQuantite];

        for(int i=0; i<tableauFruit.length;i++){
            tableauNouveau[i]=tableauFruit[i];
        }

        for(int i=5;i<tableauNouveau.length;i++){
            System.out.println("Entrer un nouveau nom de fruit : ");
            tableauNouveau[i]=lecture.nextLine();
        }

        for(int i=0;i<tableauNouveau.length;i++){
            System.out.println(tableauNouveau[i]);
        }

        return tableauNouveau;
    }
}
