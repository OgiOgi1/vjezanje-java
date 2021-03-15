import java.util.Scanner;

public class SabiranjeCifara {
    public static void main(String[] args) {
        // vrijednosti
        int uneseniBroj;
        int prviBroj=0;
        int drugiBroj=0;
        int treciBroj=0;
        int rezultat;



        // unošenje broja
        System.out.println("Unesite cijeli broj između 0 i 999");

      Scanner unos = new Scanner((System.in));
      uneseniBroj =unos.nextInt();


        //racunanje

        prviBroj=uneseniBroj%10;
        drugiBroj=(uneseniBroj/10)%10;
        treciBroj=(uneseniBroj/100)%10;
        System.out.println("prviBroj = " + prviBroj);
        System.out.println("drugiBroj = " + drugiBroj);
        System.out.println("treci = " + treciBroj);
        rezultat = prviBroj+drugiBroj+treciBroj;
        //ispis
        System.out.println(rezultat);
    }
}
