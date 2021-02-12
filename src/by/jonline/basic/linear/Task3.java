package by.jonline.basic.linear;

public class Task3 {
    public static void main(String[] args) {
        int x = 1, y = 8;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("z = " + z);
    }
}
