import java.util.Scanner;

public class OverLoad {
    public static void main(String[] args) {
        int[] niz = {3,4,3,2,45,5,6,7,8,2};
        double[] nizDouble= {20.3,1.1,1.1,1.1,1.1,1.1,1.1,1.1,1.1,1.1};
        System.out.println("Int " + average(niz));
        System.out.println("Double " + average(nizDouble));

    }

    public static int average(int[] niz) {
        int zbirBrojeva = 0;

        int brojEleemenataUNizu = niz.length;
        for (int i = 0; i < niz.length; i++) {
             zbirBrojeva +=niz[i];
        }

        int aritmetickaVrijednost = zbirBrojeva / brojEleemenataUNizu;
        return aritmetickaVrijednost;
    }

    public static double average(double[] array){
        double zbirBrojeva = 0;
        double brojElemenataUNizu = array.length;
        for(int i = 0; i < array.length;i++){
            zbirBrojeva += array[i];
        }
        double artimetickaSredinaDouble = zbirBrojeva / brojElemenataUNizu;

        return artimetickaSredinaDouble ;
    }
}
