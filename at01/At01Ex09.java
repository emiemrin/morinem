package morinem.at01;

public class At01Ex09 {

    public static void main(String[] args) {
        double dResultat1;
        double dResultat2;
        double dResultat3;
        double dResultat4;

        dResultat1=14/3;
        System.out.println("A:"+ dResultat1); //Quand tu écris une équation avec des nombres entiers (par de .0), elle va automatiquement arrondir.

        dResultat2=14.0 / 3.0;
        System.out.println("B:"+ dResultat2); //Ici, il y a des .0 à la fin des deux nombres. Donc, elle va afficher le nombre après la virgule

        dResultat3=14 / 3.0;
        System.out.println("C:"+ dResultat3); //Même chose que B

        dResultat4=14 % 3;
        System.out.println("D:"+ dResultat4); //La fonction % est utilisé pour savoir le restant du premier nombre. 
    }

}
