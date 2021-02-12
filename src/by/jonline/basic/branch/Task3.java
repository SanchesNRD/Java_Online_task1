package by.jonline.basic.branch;

public class Task3 {
    public static void main(String[] args) throws Exception {
        double x1 = 1, y1 = 5;
        double x2 = -2, y2 = -5;
        double x3 = 0, y3 = 0;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
