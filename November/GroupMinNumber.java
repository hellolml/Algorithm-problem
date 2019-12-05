package November;

import java.util.Scanner;

public class GroupMinNumber {
    public static void main(String args[]){
        int [] num  = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            num[i] = sc.nextInt();
        }
        for (int i = 1;i<10;i++){
            if(num[i]!=0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        while (num[0]!=0){
            System.out.print(0);
            num[0]--;
        }
        for (int i = 1;i<10;i++){
            while (num[i]!=0){
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
