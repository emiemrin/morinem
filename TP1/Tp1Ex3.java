package morinem.TP1;

public class Tp1Ex3 {

    public static void main(String[] args) {
        int [][] tableauNombre = new int [3][3];
        tableauNombre[0] = new int[] {1,4,7};
        tableauNombre[1] = new int[] {2,5,8};
        tableauNombre[2] = new int[] {3,6,9};

        for (int i = 0; i < tableauNombre.length; i++) {
            for (int j = 0; j < tableauNombre[i].length; j++) {
                System.out.print(tableauNombre[i][j] + " ");
            }
            System.out.println();
        }
    }

}
