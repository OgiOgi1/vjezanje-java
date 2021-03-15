public class NumberMetodaJava {
    public static void main(String[] args) {
    }

    public static boolean isPrime(int number) {
   //     if(number > 10000){
   //         System.out.println("Unjeli ste prevelik broj");
     //   }

        for (int i = 2; i <number;i++){
            if( number % i == 0){
                return  false;

            }
        }
        return true;
    }

}
