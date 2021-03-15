import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {
        //vrijednosti
        double distanca=325.0;
        double potrosnja=8.5;
        double cijenaPoLitri=1.95;
        double cijenaKostanjaPrevoza=0;

        // unos vrijednosti distance
        System.out.println("Unesite distancu: ");
        Scanner unos = new Scanner((System.in));
        distanca=unos.nextDouble();

        // unos vrijednosti
        System.out.println("Unesite distancu: ");
        potrosnja=unos.nextDouble();

        // unos vrijednosti
        System.out.println("Unesite distancu: ");
        cijenaPoLitri=unos.nextDouble();

        //racun
        cijenaKostanjaPrevoza=distanca/100*potrosnja*cijenaPoLitri;

        // ispis

        System.out.println(cijenaKostanjaPrevoza);

    }
}
