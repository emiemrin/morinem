package morinem.at03;

public class At03Ex08 {

    public static void main(String[] args) {
        double dMoyenne;
        Object [][] tableauEtudiants =new Object [4][9];
        tableauEtudiants[0] = new Object [] {"Étudiants","Pierre","André","Julie","Brigitte","Anne","Olivier","Simon","Nadine"};
        tableauEtudiants[1] = new Object [] {"TP1", 65,78,43,82,76,91,71,96};
        tableauEtudiants[2] = new Object [] {"TP2", 45,55,67,89,100,95,92,81};
        tableauEtudiants[3] = new Object [] {"Examen1", 34,65,21,67,75,54,69,54};

        for (int i = 0; i < tableauEtudiants.length; i++) {
            for (int j = 0; j < tableauEtudiants[i].length; j++) {
                System.out.print(tableauEtudiants[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMoyenne des examens : ");
        moyEval(tableauEtudiants);

        System.out.println("\nMoyenne des élèves : ");
        moyEtu(tableauEtudiants);
    }

    public static void moyEval(Object[][] tableauEtudiants){
        
        for(int ligne=1; ligne < tableauEtudiants.length;ligne++){
            String sNomEval = (String) tableauEtudiants[ligne][0];
            double dSomme = 0;
            int iNbrEtudiants =0;

            for(int colonne =1; colonne<tableauEtudiants[ligne].length; colonne++){
                dSomme += (int) tableauEtudiants[ligne][colonne];
                iNbrEtudiants++;
            }
            double dMoyenne = dSomme / iNbrEtudiants;
            System.out.printf("%s : %.2f%n", sNomEval, dMoyenne);
        }

       
    }

    public static void moyEtu(Object[][] tableauEtudiants){
        
        for(int colonne=1; colonne < tableauEtudiants[0].length;colonne++){
            String sNomEtudiant = (String) tableauEtudiants[0][colonne];
            double dSomme = 0;
            int iNbrNotes =0;

            for(int ligne =1; ligne<tableauEtudiants.length; ligne++){
                dSomme += (int) tableauEtudiants[ligne][colonne];
                iNbrNotes++;
            }
            double dMoyenne = dSomme / iNbrNotes;
            System.out.printf("%s : %.2f%n", sNomEtudiant, dMoyenne);
        }

       
    }
}




