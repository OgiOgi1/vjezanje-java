import java.util.Scanner;

public class FuntaBAM {
    public static void main(String[] args) {
        double funta;
        double bam;

        System.out.println("Unesite koliko funti");
        Scanner unos = new Scanner(System.in);
        funta = unos.nextDouble();
if(funta>=0 ) {
    bam = funta * 2.2;

    System.out.println(bam);
}
else{
    System.out.println("Ponovi unos");
}

    }
}
