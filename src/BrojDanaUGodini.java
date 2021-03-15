public class BrojDanaUGodini {
    public static void main(String[] args) {
        brojDanaUGodini1(2000);
    }

    public static int brojDanaUGodini1(int godina) {
        if (godina % 4 == 0 || godina % 100 == 0 || godina % 400 == 0) {
            return 366;
        }
        return 365;

    }

}