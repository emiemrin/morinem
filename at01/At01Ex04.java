package morinem.at01;

import java.util.Scanner;

public class At01Ex04 {

    public static void main(String[] args) {
    
        int Inote;
        Scanner lectureNote = new Scanner(System.in);

        System.out.println("Entrer la note de l'élève dans le cours de Mathématiques : ");
        Inote = lectureNote.nextInt();

        if (Inote<60) {
            System.out.println("L'élève a échoué le cours de Mathématiques");
        }

        else if (Inote>=60) {
            System.out.println("L'élève a réussi le cours de Mathématiques");
        }
        
        lectureNote.close();
    }
}
