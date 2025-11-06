package morinem.at03;

import java.util.*;

public class At03Ex07 {

    public static void main(String[] args) {
        int[] tableauNbr = new int[10];
        int[] tableauOccurrence = new int[5];
        int iOccurrence=0;
        Random random = new Random();
        int randInt = (int) (Math.random() *5);

        for(int i=0; i<tableauNbr.length;i++){
            tableauNbr[i]= (int) (Math.random() *5);
            System.out.println(tableauNbr[i]);
        }

        occurrence(tableauNbr, tableauOccurrence);

        System.out.println("\n\nOccurrences : ");
        for(int i=0;i<tableauOccurrence.length;i++){
            System.out.println("Nombre " + i + " apparaît " + tableauOccurrence[i] + " fois.");
        }
    }

    public static void occurrence(int[] tableauNbr, int[] tableauOccurrence){
        for (int i=0; i<tableauNbr.length;i++){
            int iOccurrence = tableauNbr[i];
            tableauOccurrence[iOccurrence]++;
        }
    }

}
