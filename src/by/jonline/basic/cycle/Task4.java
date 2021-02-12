package by.jonline.basic.cycle;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 200; i++){
            sum *= i*i;
        }
        System.out.println(sum);
    }
}
