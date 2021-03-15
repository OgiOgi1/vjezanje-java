public class CountLetters {
    public static void main(String[] args) {
        System.out.println("Broj slova e:" + count("aaaaawe", 'e'));

    }

    public static int count(String str, char e) {
        int brojac = 0;
        for (int i = 0; i < str.length(); i++) {
            char brojKaraktera = str.charAt(i);
            if (brojKaraktera == e){
                brojac++;

            }
        }


        return brojac;
    }
}
