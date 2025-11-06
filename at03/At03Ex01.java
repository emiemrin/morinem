package morinem.at03;

import java.util.*;

public class At03Ex01 {

    public static void main(String[] args) {
        String[] tableauMots = new String[5];
        Scanner lectureMot = new Scanner(System.in);

        System.out.println("Entrer le premier mot : ");
        tableauMots[0]=lectureMot.nextLine();

        System.out.println("Entrer le deuxième mot : ");
        tableauMots[1]=lectureMot.nextLine();

        System.out.println("Entrer le troisième mot : ");
        tableauMots[2]=lectureMot.nextLine();

        System.out.println("Entrer le quatrième mot : ");
        tableauMots[3]=lectureMot.nextLine();

        System.out.println("Entrer le cinquième mot : ");
        tableauMots[4]=lectureMot.nextLine();

        for(int i=0; i<tableauMots.length;i++){
            System.out.println(tableauMots[i]);
        }

        lectureMot.close();
    }

}
