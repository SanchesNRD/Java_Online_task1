package by.jonline.basic.linear;

public class Task4 {
    public static void main(String[] args) {
        double R = 123.789;
        int integer = (int)R;
        double fractional = R - integer;
        System.out.println("last R = " + R);
        R = fractional * 1000 + ((double) integer * 0.001);
        //System.out.println("R = " + String.format(("%.3f"), R));
        System.out.println("R = " + R);
    }
}
