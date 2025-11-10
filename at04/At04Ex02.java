package morinem.at04;

import java.util.*;

public class At04Ex02 {

    public static void main(String[] args) {
        int nbr[] = new int[10];
        Scanner lectureMot = new Scanner(System.in);


        for(int i = 0; i<nbr.length;i++){
            System.out.println("Entrer un numéro : ");
            nbr[i] = lectureMot.nextInt();
        }

        for(int i = 0 ;i<nbr.length;i++){
            System.out.println("\n" + nbr[i]);
        }
        
        lectureMot.close();

    }

}
