import java.util.Scanner;

public class VelicinaNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite duzinu niza");
        int duzinaNiza = scanner.nextInt();

        int index = 0;

        int[] niz = new int[duzinaNiza];
        int najveciElement = niz[0];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("unesite vrj:");
            niz[i] = scanner.nextInt();
        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > najveciElement) {
                najveciElement = niz[i];
                index = i;
            }

        }
        System.out.println(" Najveci element je " + najveciElement + " Index " + index);
    }
}
