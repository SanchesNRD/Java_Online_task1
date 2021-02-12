package by.jonline.basic.branch;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task2 {
    public static void main(String[] args) throws Exception  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        a = (a < b) ? a : b;
        c = (c < d) ? c : d;
        a = (a > c) ? a : c;
        System.out.println(a);
    }
}
