public class PalindromicNumber {
    public static void main(String[] args) {
        int brojac = 0;
        int palindromicNumber = 0;
        if(isPalindrom(123)&& isPrime(123)){}
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                return false;

            }
        return true;
    }

    private static boolean isPalindrom(int broj) {
        return true;
    }
}
