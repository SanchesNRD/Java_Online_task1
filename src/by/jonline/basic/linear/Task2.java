package by.jonline.basic.linear;

public class Task2 {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 1;
        double z;
        z = (b + Math.sqrt(b * b + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println( "z = " + String.format(("%.4f"), z));
    }
}
