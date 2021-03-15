import java.util.Scanner;

public class Riža {
    public static void main(String[] args) {
        int tezina1;
        int tezina2;
        double cijena1;
        double cijena2;
        double cijenaKilograma1;
        double cijenaKilograma2;


        System.out.println("Unesite težinu i cijenu za prvo pakovanje");
        Scanner unos = new Scanner(System.in);
        tezina1 = unos.nextInt();
        cijena1 = unos.nextDouble();
        cijenaKilograma1=cijena1/tezina1;

        System.out.println("Unesite težinu i cijenu za drugo pakovanje");
        Scanner unos1 = new Scanner(System.in);
        tezina2 = unos1.nextInt();
        cijena2 = unos1.nextDouble();
        cijenaKilograma2=cijena2/tezina2;

        if (cijenaKilograma1<cijenaKilograma2)
        {
            System.out.println("Povoljniji Vam je prvi unos)");
        }
        else
        {
            System.out.println("Povoljnija je druga varijanta");
        }




    }
}
