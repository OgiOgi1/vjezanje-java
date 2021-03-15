import java.util.Scanner;

public class NasumicniBroj {
    public static void main(String[] args) {
        int randomBroj = (int) Math.random();
        System.out.println("Pogodi broj:");

        Scanner scanner = new Scanner(System.in);
        int korisnikovUnos = scanner.nextInt();

        while(korisnikovUnos != randomBroj) {
            if (randomBroj < korisnikovUnos) {
                System.out.println("Broj koji ste unjeli je manji od generisanog, pokusajte ponovo:");
                korisnikovUnos = scanner.nextInt();
            }
            else{
                System.out.println("Broj koji ste unjeli je veci od generisanog, pokusajte ponovo");
                korisnikovUnos = scanner.nextInt();
            }
        }
        System.out.println("Pogodili ste broj");
    }
}
