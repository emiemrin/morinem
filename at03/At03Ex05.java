package morinem.at03;

import java.util.Random;

public class At03Ex05 {

    public static void main(String[] args) {
        int[] tableauNombre = new int[10];
        int iNbr1;
        int iNbr2;
        Random random = new Random();
        int randInt = (int) (Math.random() *100);

        for(int i=0; i<tableauNombre.length;i++){
            tableauNombre[i]=(int) (Math.random() *100);
        }

        for(int i=0;i<tableauNombre.length;i++){
            System.out.println(tableauNombre[i]);
        }

         permutation(tableauNombre, tableauNombre[0], tableauNombre[9]);
         permutation(tableauNombre, tableauNombre[1], tableauNombre[8]);
         permutation(tableauNombre, tableauNombre[2], tableauNombre[7]);
         permutation(tableauNombre, tableauNombre[3], tableauNombre[6]);
         permutation(tableauNombre, tableauNombre[4], tableauNombre[5]);

        for(int i=0;i<tableauNombre.length;i++){
            System.out.println(tableauNombre[i]);
        }
    }

    public static void permutation (int[] tableauNombre, int iNbr1, int iNbr2){
        int iTemporaire = tableauNombre[iNbr1];

        tableauNombre[iNbr1] = tableauNombre[iNbr2];

        tableauNombre[iNbr2] = iTemporaire;

        
    }
}
