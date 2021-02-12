package by.jonline.basic.branch;

public class Task5 {
    public static void main(String[] args) {
        int x = 5;
        double y ;
        if(x <= 3){
            y = x * x - 3 * x + 9;
        }
        else{
            y = 1 / (double)(Math.pow(x,3) + 6);
        }
        System.out.println("y = " + String.format(("%.2f"), y));
    }
}
