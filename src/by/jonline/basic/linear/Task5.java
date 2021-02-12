package by.jonline.basic.linear;

public class Task5 {
    public static void main(String[] args) {
        int seconds = 6456;
        int hours = seconds / 3600;
        seconds = seconds - hours * 3600;
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
