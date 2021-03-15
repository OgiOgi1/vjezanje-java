public class Letters {
    public static void main(String[] args) {

    }
    public static int countLetters(String rjec){
        int brojac = 0;
        for(int i = 0; i < rjec.length() ;i ++){
            char karakter = rjec.charAt(0);// = 'P'
            if(Character.isLetter('P'))
            {
                brojac++;
            }

        }

        return  brojac;
    }
}
