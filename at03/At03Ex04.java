package morinem.at03;
import java.util.*;
import java.util.Arrays;

public class At03Ex04 {

    public static void main(String[] args) {
            int[] tableauNbr= new int[5];
            int[] tableauCopie= new int[tableauNbr.length];
            Random random = new Random();
            int randInt = (int) (Math.random() *100);

            for(int i=0; i<tableauNbr.length;i++){
                tableauNbr[i]=(int) (Math.random() *100);
            }

           for(int i=0;i<tableauNbr.length;i++){
            System.out.println(tableauNbr[i]);
           }

           for(int i=0;i<tableauNbr.length;i++){
            tableauCopie[i]=tableauNbr[i];
           }

           Arrays.sort(tableauNbr);
           System.out.println("Voici la valeur la plus petite : "+tableauNbr[0]);
           System.out.println("Voici la valeur la plus grande : " + tableauNbr[4]);

           int iNbrPetit = tableauNbr[0];
           int iNbrGrand = tableauNbr[4];
           int iIndice1 = 0;
           int iIndice2 = 0;
           for(int i=0; i<tableauCopie.length;i++){
            if (tableauCopie[i]==iNbrPetit) {
                iIndice1 = i;
                break;
            }
           }

           for(int i=0; i<tableauCopie.length;i++){
            if (tableauCopie[i]==iNbrGrand) {
                iIndice2 = i;
                break;
            }
           }

           System.out.println("La position du plus petit nombre est : " + iIndice1);
           System.out.println("La position du plus grand nombre est : " + iIndice2);

    }

}
