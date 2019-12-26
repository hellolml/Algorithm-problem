package November;

import java.util.Scanner;

public class NumRevers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String str = String.valueOf(m);
        for (int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
