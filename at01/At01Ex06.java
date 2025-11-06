package morinem.at01;

import java.util.Scanner;

public class At01Ex06 {
    public static void main(String[] args) {
        String sNom;
        double dLongueur;
        double dLargeur;
        int iChoix;
        double dPrix = 0;
        Scanner lecture = new Scanner(System.in);

       
        System.out.println("Bienvenue chez BoisFranc! Pour commencer, entrer votre nom : ");
        sNom = lecture.nextLine();
       
        System.out.println("Entrer la longueur de votre plancher : ");
        dLongueur = lecture.nextDouble();

        System.out.println("Entrer la largeur de votre plancher : ");
        dLargeur = lecture.nextDouble();

        System.out.println("Maintenant, choisissez votre type de plancher (1. Chêne, 2. Érable, 3. Pin) : ");
        iChoix = lecture.nextInt();

        lecture.close();

        if (iChoix>3) {
            System.out.println("Vous n'avez pas choisit le bon type de plancher.");
            System.exit(0);
        }

        if (iChoix==1) {
            dPrix = (dLongueur*dLargeur)*5;
        }

        else if (iChoix==2) {
            dPrix = (dLongueur*dLargeur)*12;
        }

        else if (iChoix==3) {
            dPrix=(dLongueur*dLargeur)*10;
        }
            
        
        System.out.println("Pour votre pose de plancher, " + sNom + ", votre plancher de " + (dLongueur*dLargeur) + "m^2, de type" + iChoix + ", vous coutera " + dPrix + "$");
       
        
        

    }
}
