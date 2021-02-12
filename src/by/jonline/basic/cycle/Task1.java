package by.jonline.basic.cycle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 1; i < Math.abs(x); i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
