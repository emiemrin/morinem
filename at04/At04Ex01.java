package morinem.at04;

import java.util.*;

public class At04Ex01 {

    public static void main(String[] args) {
        String mots[] = new String[5];
        Scanner lectureMot = new Scanner(System.in);


        for(int i = 0; i<mots.length;i++){
            System.out.println("Entrer un mot : ");
            mots[i] = lectureMot.nextLine();
        }

        for(int i = 0 ;i<mots.length;i++){
            System.out.println("\n" + mots[i]);
        }
        
        lectureMot.close();

    }

}
