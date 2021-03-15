import java.util.Scanner;

public class Bodovi {
    public static void main(String[] args) {
        ispisiOcjenu(65.9);
        ispisiOcjenu(56);
    }
    public static void ispisiOcjenu(double bodovi){


        if(bodovi>=0 && bodovi<=100) {
            if (bodovi >= 90) {
                System.out.println(" Ocjena 10");
            }
            if (bodovi >= 80 && bodovi < 90) {
                System.out.println(" Ocjena 9");
            }
            if (bodovi >= 70 && bodovi < 80) {
                System.out.println(" Ocjena 8");
            }
            if (bodovi >= 60 && bodovi < 70) {
                System.out.println(" Ocjena 7");
            }
            if (bodovi >= 50 && bodovi < 60) {
                System.out.println(" Ocjena 6");
            }
            if (bodovi < 50) {
                System.out.println("Niste položili");
            }
        }
        else{
            System.out.println("Ponovite unos");
        }

    }



    }
