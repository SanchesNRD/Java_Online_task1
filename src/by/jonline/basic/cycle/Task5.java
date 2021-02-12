package by.jonline.basic.cycle;

public class Task5 {
    public static void main(String[] args) {
        double e = 0.1;
        int n = 2;
        double sum = 0;
        for(int i = 0; i < n; i++){
            double a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            sum += (a >= e) ? a : 0;
        }
        System.out.println(sum);
    }
}
