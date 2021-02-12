package by.jonline.basic.cycle;

public class Task6 {
    public static void main(String[] args) {
        for(int i = 0; i <= 255; i++){
            int asciiNumber = i;
            char letter = (char) asciiNumber;
            System.out.println("letter = " + letter + " asciiNumber = " + i);
        }
    }
}
