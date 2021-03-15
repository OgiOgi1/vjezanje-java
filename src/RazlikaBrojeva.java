import java.util.Scanner;

public class RazlikaBrojeva {
    public static void main(String[] args) {
        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        int pomoc;
        int razlik = 0;
        int brojKorisnika;

        if (drugiBroj > prviBroj) {
            pomoc = drugiBroj;
            drugiBroj = prviBroj;
            prviBroj = pomoc;
        }
        System.out.println("Rjesite " + prviBroj + " - " + drugiBroj);
        razlik = prviBroj - drugiBroj;
        Scanner unos = new Scanner(System.in);
        brojKorisnika = unos.nextInt();

        if (razlik == brojKorisnika) {
            System.out.println("Tacno");
        } else {
            System.out.println("Netačno");
        }
        ;
    }
}


