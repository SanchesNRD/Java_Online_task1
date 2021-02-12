package by.jonline.basic.cycle;

public class Task8 {
    public static void main(String[] args) {
        int a = 180, b = 10180;
        if(a > b){
            a += b;
            b = a - b;
            a -= b;
        }
        for(int i = 0; i < 10; i++){
            int aNew = a;
            int bNew = b;
            do{
                if (aNew % 10 == i){
                    do {
                        if(bNew % 10 == i){
                            System.out.println(i);
                            break;
                        }
                        bNew /= 10;
                    }while(bNew != 0);
                }
                aNew /= 10;
            }while(aNew!=0);
        }
    }
}
