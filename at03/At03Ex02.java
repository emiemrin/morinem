package morinem.at03;

import java.util.*;

public class At03Ex02 {

    public static void main(String[] args) {
        int[] tableauNbr = new int[10];
        Scanner lectureNbr=new Scanner(System.in);

        for(int i=0; i<tableauNbr.length;i++){
            System.out.println("Entrer un numéro : ");
            tableauNbr[i] = lectureNbr.nextInt();
        }

        for(int i=0; i<tableauNbr.length;i++){
            System.out.println(tableauNbr[i]);
        }

        lectureNbr.close();
    }

}
