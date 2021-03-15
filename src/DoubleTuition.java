public class DoubleTuition {
    public static void main(String[] args) {
        int year = 0;
        double pocetnaSkolarina = 5000;
        double trenutnaSkolarina = pocetnaSkolarina;
        while (trenutnaSkolarina < pocetnaSkolarina * 2) {
            trenutnaSkolarina *= 1.07;
            year++;
            System.out.println("year" + year + " on prize " + trenutnaSkolarina);
        }
        System.out.println("Double in " + year + " years " + trenutnaSkolarina);
    }
}
