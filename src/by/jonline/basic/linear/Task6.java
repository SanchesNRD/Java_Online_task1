package by.jonline.basic.linear;

public class Task6 {
    public static void main(String[] args) {
        int x = -2, y = 3;
        boolean inSqrt = (Math.abs(x) <= 2 && Math.abs(y) <= 3) || (Math.abs(x) <= 4 && y >= -3 && y <= 0);
        System.out.println(inSqrt);
    }
}
