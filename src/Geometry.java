public class Geometry {
    public static void main(String[] args) {
        System.out.println("Resenje" + area(5, 6.5));

    }
    public static double area(int n, double s){
        double area = 0;

          area= n * Math.pow(s,2) / 4 * (Math.PI/ n);


        return area;
    }
}
