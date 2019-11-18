package November;

import java.util.Scanner;

public class NumberCount {
    public static void main(String args[]){
        int []a = new int[20];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        for (int i = 0;i<str.length();i++){
            a[str.charAt(i)-'0']++;
        }
        for (int i= 0;i<a.length;i++){
            if(a[i]!=0){
                System.out.println(i+":"+a[i]);
            }
        }
    }
}
