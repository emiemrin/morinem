package morinem.at02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class At02Ex06 {

        public static void main(String[] args) {
        
        int iNbrGrand;
        int iNbrPetit;
        int iMoyenne;
        int iSomme = 0;
        Scanner lectureNombre = new Scanner(System.in);
        List<Integer> nombres = new ArrayList<>();
        int iNbr;
        
        System.out.println("Entrez des nombres (0 pour terminer) :");
        
        
        do{
            System.out.print("- ");
            iNbr = lectureNombre.nextInt();

            if (iNbr != 0) {
                nombres.add(iNbr);
            }

        }while(iNbr!=0);
        
        Collections.sort(nombres);
        iNbrGrand = nombres.get(nombres.size()-1);
        iNbrPetit = nombres.get(0);
        for(int nb : nombres){
            iSomme += nb;
        } 

        iMoyenne= iSomme/nombres.size();
        System.out.println("Voici le numéro le plus grand : "+ iNbrGrand);
        System.out.println("Voici le numéro le plus petit : "+ iNbrPetit);
        System.out.println("Voici la moyenne des nombres : " + iMoyenne);

        lectureNombre.close();
    }
}
