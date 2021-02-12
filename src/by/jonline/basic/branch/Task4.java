package by.jonline.basic.branch;

public class Task4 {
    public static void main(String[] args) {
        int A = 8, B = 4;
        int x = 8, y = 10, z = 5;
        if(A>B){
           A = A + B;
           B = A - B;
           A = A - B;
        }
        if(x > y){
            x += y;
            y = x - y;
            x -= y;
        }
        if(x > z){
            x += z;
            z = x - z;
            x -= z;
        }
        if(y > z){
            y += z;
            z = y - z;
            y -= z;
        }
        if(x <= A && y <= B){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
