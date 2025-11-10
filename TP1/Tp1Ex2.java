package morinem.TP1;

public class Tp1Ex2 {

    public static void main(String[] args) {
        int [][] tableauNombre = new int [3][3];
        tableauNombre[0] = new int[] {1,2,3};
        tableauNombre[1] = new int[] {4,5,6};
        tableauNombre[2] = new int[] {7,8,9};

        for (int i = 0; i < tableauNombre.length; i++) {
            for (int j = 0; j < tableauNombre[i].length; j++) {
                System.out.print(tableauNombre[i][j] + " ");
            }
            System.out.println();
        }
    }

}
