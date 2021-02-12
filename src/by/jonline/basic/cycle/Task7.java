package by.jonline.basic.cycle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        if(n > m){
            n += m;
            m = n - m;
            n -= m;
        }
        for(int i = n; i <= m ; i++){
            System.out.println("Для числа " + i + " делителями являются:");
            for(int j = 2; j < i; j++){
                if(i%j == 0) System.out.println(j);
            }
        }
    }
}
