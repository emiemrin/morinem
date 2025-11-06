package morinem.at01;

import java.util.Scanner;

public class At01Ex05 {
    public static void main(String[] args) {
        double dPrix = 0;
        Scanner lecturePrix = new Scanner(System.in);

        System.out.println("Entrer le prix qui sera accordé le rabais de 25% : ");
        dPrix = lecturePrix.nextDouble();

        System.out.println("Le prix original était de " + dPrix +"$, Maintenant il est en rabais pour " + (dPrix*0.75) + "$" );

        lecturePrix.close();
    }
}
