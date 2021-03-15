import java.util.Scanner;

public class PomocnaKlasa {
    public static int[] unesiNiz(int brojUnosa) {
        System.out.println("Unesite broj intagera" + brojUnosa);
        Scanner scanner = new Scanner(System.in);

        int[] niz = new int[brojUnosa];

        for (int i = 0; i < brojUnosa; i++) {
            niz[i] = scanner.nextInt();
        }

        return niz;
    }
    public static void ispis(int [] niz){
        for(double proizvod : niz);
    }
}
