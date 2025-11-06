package morinem.at03;

import java.util.*;

public class At03Ex03 {

    public static void main(String[] args) {
            int[] tableau1 = new int[10];
            Random random = new Random();

            for(int i=0; i<tableau1.length;i++){
                tableau1[i]=random.nextInt();
            }

            for(int i=0; i<tableau1.length;i++){
                System.out.println(tableau1[i]);
            }

            System.out.println("   ");

            for (int i=tableau1.length - 1; i>=0;i--){
                System.out.println(tableau1[i]);
            }
    }

}
