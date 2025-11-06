package morinem.at01;

public class At01Ex07 {


     public static void main(String[] args) {
        double dResultat1;
        double dResultat2;
        double dResultat3;
        double dResultat4;
        double dResultat5;
        double dResultat6;

        dResultat1=3 * 10 + 45/5 - 8+56%20;
        System.out.println("A:" + dResultat1);

        dResultat2=3 * 10 + 45 / 5 - (8 + 56) % 20;
        System.out.println("B:" + dResultat2);

        dResultat3=3 * 10 + 45 / (5- 8 + 56) % 20;
        System.out.println("C:" + dResultat3);

        dResultat4=3 * 10 + 45 / (5 - 8) + 56 % 20;
        System.out.println("D:" + dResultat4);

        dResultat5=3 * (10 + 45) / 5 - 8 + 56 % 20;
        System.out.println("E:" + dResultat5);
        
        dResultat6=3 * (10 + 45 / 5) - 8 + 56 % 20;
        System.out.println("F:" + dResultat6);

     }

}
