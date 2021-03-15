import java.util.Scanner;

public class Rangiranje {
    public static void main(String[] args) {
        int bodovi=0;

        System.out.println("Unesi osvojeni brod bodova ( 0 - 100 )");
        Scanner unos = new Scanner(System.in);
        bodovi = unos.nextInt();


        if(bodovi>=0 && bodovi<=100) {
            if (bodovi >= 90) {
                System.out.println(" Osjena 10");
            }
            if (bodovi >= 80 && bodovi < 90) {
                System.out.println(" Osjena 9");
            }
            if (bodovi >= 70 && bodovi < 80) {
                System.out.println(" Osjena 8");
            }
            if (bodovi >= 60 && bodovi < 70) {
                System.out.println(" Osjena 7");
            }
            if (bodovi >= 50 && bodovi < 60) {
                System.out.println(" Osjena 6");
            }
            if (bodovi < 50) {
                System.out.println(" Niste položili");
            }
        }
        else{
            System.out.println("Ponovite unos");
        }

    }
}
