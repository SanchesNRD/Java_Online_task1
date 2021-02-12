package by.jonline.basic.branch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = 180 - (x + y);
        if(z > 0){
            System.out.println("Треугольник с углами " + x + " и " + y + " может существовать");
            if(z == 90 || x == 90 || y == 90) System.out.println("Прямоугольный");
        }
        else{
            System.out.println("Треугольник с углами " + x + " и " + y + " не может существовать");
        }
        //System.out.println("x = " + x + " y = " + y);
    }
}
