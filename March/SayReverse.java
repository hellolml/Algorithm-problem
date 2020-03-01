package March;

import java.util.Scanner;

public class SayReverse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        StringBuilder s = new StringBuilder(x);
        StringBuilder s1 = s.reverse();
        String str = String.valueOf(s1);
        StringBuilder s3;
        String [] strings = str.split(" ");
        for(int i = 0;i<strings.length;i++){
            s3 = new StringBuilder(strings[i]);
            strings[i] = String.valueOf(s3.reverse());
        }
        for (int i=0;i<strings.length;i++){
            System.out.print(strings[i]);
            if(i<strings.length-1){
                System.out.print(" ");
            }
        }
    }
}
