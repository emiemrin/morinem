package morinem.at03;


public class At03Ex06 {

    public static void main(String[] args) {
        int[] tableauNbr= {-65,-34,7,-3,-43,14,23,-9,45,11};
        int iResultatPositif=0;
        int iResultatNegatif=0;

        for(int i=0; i<tableauNbr.length; i++){
            if (tableauNbr[i]<0) {
                iResultatNegatif+=tableauNbr[i];
            }

            else if (tableauNbr[i]>0) {
                iResultatPositif+=tableauNbr[i];
            }
        }

        System.out.println("Voici le résultat de toutes les nombres positifs : " + iResultatPositif);
         System.out.println("Voici le résultat de toutes les nombres négatifs : " + iResultatNegatif);

         
    }

}
