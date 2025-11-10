package morinem.TP1;

import java.util.*;

public class Tp1Ex1 {

    public static void main(String[] args) {
        Scanner lectureNombre=new Scanner(System.in);
        int[] tableauNbr = new int[10];

        for(int i=0; i<tableauNbr.length;i++){
            System.out.println("Entrer des numéros : ");
            tableauNbr[i] = lectureNombre.nextInt();
        }

        triNombre(tableauNbr);

        lectureNombre.close();
    }

    public static void triNombre(int[] tableauNbr){
        Arrays.sort(tableauNbr);
        System.out.println("\n");
        for(int i=0; i<tableauNbr.length;i++){
            System.out.println(tableauNbr[i]);
        }
    }
}
