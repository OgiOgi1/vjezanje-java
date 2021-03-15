public class Characters {
    public static void main(String[] args) {
        ispisiKarakere('a', 'z', 10);

    }

    public static void ispisiKarakere(char pocetniKarakter, char zavrsniKarakter, int brojPoLiniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i <= zavrsniKarakter; i++) {
            brojac++;
            System.out.print(" " + i);
            if(brojPoLiniji == brojac){
                brojac = 0;
                System.out.println();
            }
        }
    }
}
