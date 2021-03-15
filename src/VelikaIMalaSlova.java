import java.util.Scanner;

public class VelikaIMalaSlova {
    public static void main(String[] args) {
        System.out.println("Unesite string:");
        Scanner scanner = new Scanner(System.in);
        String korisnikovUnos = "Bla";
        int brojacVelikihSlova = 0;
        int brojacMalihSlova = 0;
        for (int i = 0; i < korisnikovUnos.length(); i++)

            if (Character.isUpperCase(korisnikovUnos.charAt(i))) {
                brojacVelikihSlova++;

            }
        if (Character.isLowerCase(korisnikovUnos.charAt(0))) {
            brojacMalihSlova++;
        }

    }
}