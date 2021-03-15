import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Unesite ocjenu kao A ,B, C, D, ili F");
        Scanner scanner = new Scanner(System.in);
        String unos = scanner.next();

        if (unos.equals("A")) {
            System.out.println("Ocjena je 5");
        }
        if (unos.equals("B")) {
            System.out.println("Ocjena je 4");
        }
        if (unos.equals("C")) {
            System.out.println("Ocjena je 3");
        }
        if (unos.equals("D")) {
            System.out.println("Ocjena je 2");
        }
        if (unos.equals("F")) {
            System.out.println("Ocjena je 1");
        }

    }
}
