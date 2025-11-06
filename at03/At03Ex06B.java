package morinem.at03;

import java.util.Random;

public class At03Ex06B {

    public static void main(String[] args) {
        int[] tableauNbr= new int[10];
        int iResultatPositif=0;
        int iResultatNegatif=0;

        Random random = new Random();
        int iMinimum =-100;
        int iMaximum =100;
        int randInt = (int) (Math.random() *(iMaximum-iMinimum+1))+iMinimum;

        for(int i=0; i<tableauNbr.length;i++){
                tableauNbr[i]=(int) (Math.random() *(iMaximum-iMinimum+1))+iMinimum;
        }

        for(int i=0; i<tableauNbr.length; i++){
            if (tableauNbr[i]<0) {
                iResultatNegatif+=tableauNbr[i];
            }

            else if (tableauNbr[i]>0) {
                iResultatPositif+=tableauNbr[i];
            }
        }

        System.out.println("Voici le résultat des nombres positifs : " +iResultatPositif);
        System.out.println("Voici le résultat des nombres négatifs : "+ iResultatNegatif);
    }

}
