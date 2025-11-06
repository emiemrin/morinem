package morinem.at02;
import java.util.*;
public class At02Ex07 {
    public static void main(String[] args) {
        String sPhrase;
        int iVoyelles = 0;
        int iConsonnes=0;

        Scanner lecture = new Scanner(System.in);

        System.out.println("Écrire une phrase : ");
        sPhrase = lecture.nextLine();

        sPhrase = sPhrase.toUpperCase();
       // char[] caracteres = sPhrase.toCharArray();

        for(int i = 0; i < sPhrase.length(); i++){
            if(sPhrase.charAt(i) == 'A' || sPhrase.charAt(i) == 'E' || sPhrase.charAt(i) == 'I' || sPhrase.charAt(i) == 'O' || sPhrase.charAt(i) == 'U' || sPhrase.charAt(i) == 'Y'){
                iVoyelles++;
            }
            else if (Character.isLetter(sPhrase.charAt(i)) == false) {
                
            }
            else{
                iConsonnes++;
            }
        }

        System.out.println("Nombre de voyelles : " + iVoyelles);
        System.out.println("Nombre de consonnes : " + iConsonnes);

        lecture.close();
    }
}
