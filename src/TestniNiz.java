public class TestniNiz {
    public static void main(String[] args) {
        System.out.println("Unesite ");
        int [] niz = PomocnaKlasa.unesiNiz(10);

        for (int proizvoljno1:niz){
            System.out.println("Broj" + proizvoljno1);
            PomocnaKlasa.ispis(niz);
        }
    }
}
