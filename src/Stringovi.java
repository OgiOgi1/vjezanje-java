import java.util.Scanner;

public class Stringovi {
    public static void main(String[] args) {
        System.out.println("Unesite neki string");
        Scanner scanner = new Scanner(System.in);
        String znak = scanner.next();
        System.out.println(znak.length());
        System.out.println(znak.charAt(0));
    }
}
