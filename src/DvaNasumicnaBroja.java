import java.util.Scanner;

public class DvaNasumicnaBroja {
    public static void main(String[] args) {
        int prviBroj;
        int drugiBroj;
        int rezultat;
        int brojKorisnika;

        prviBroj = (int) (Math.random() * 10+1);
        drugiBroj = (int) (Math.random() * 10+1);

        System.out.println("Koliko je " + prviBroj + " + " + drugiBroj);
        Scanner unos = new Scanner(System.in);
        brojKorisnika = unos.nextInt();

        rezultat = prviBroj + drugiBroj;

        if (rezultat == brojKorisnika) {
            System.out.println("Odgovor koji ste unijeli je tačan broj. Svaka čast");
        } else {
            System.out.println("Odgovor koji ste unijeli nije tačan. Tačan odgovor je " + rezultat);
        }

    }
}
