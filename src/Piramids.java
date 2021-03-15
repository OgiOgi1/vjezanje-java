public class Piramids {
    public static void main(String[] args) {
        int number=1;
        int smalest=0;
        while(number*number*number<12000){
            number++;
        }
        smalest=number-1;
        System.out.println(smalest);
        System.out.println(smalest*smalest*smalest);
    }
}
