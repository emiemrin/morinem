package morinem.at01;

public class At01Ex10 {

    public static void main(String[] args) {
    
    int iA = 2;
    int iB = 3;
    int iC = 5;
    int iD = 3;
    double dResultat1;
    double dResultat2;
    double dResultat3;

    dResultat1=(iA * (iB + iD) - 2) * 3;
    System.out.println("A:"+ dResultat1);

    dResultat2=Math.sqrt(iC - iA) * iD - 1;
    System.out.println("B:" + dResultat2);

    dResultat3=iB * (-iD + 2) - iA * (iC + iD);
    System.out.println("C:" + dResultat3);
    }

}
