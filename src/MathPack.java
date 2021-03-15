import java.util.Scanner;

public class MathPack {
    public static void main(String[] args) {
        System.out.println("Unesite neki cijeli broj");
        Scanner scanner = new Scanner(System.in);
        int cijeliBroj = scanner.nextInt();
        for (int broj = 0; broj < 100; broj++) {
            if (broj % 13 == 0){
                System.out.print( broj + "  ");

            }

            }

    }
}
