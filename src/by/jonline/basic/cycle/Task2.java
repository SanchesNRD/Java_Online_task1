package by.jonline.basic.cycle;

public class Task2 {
    public static void main(String[] args) {
        int a = -5, b = 6;
        int h = 2;
        for(int i = a; i < b; i += h){
            int y = (i > 2) ? i : -i;
            System.out.println(y);
        }
    }
}
