package December;

import java.util.Scanner;

public class XingShouNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n*n;
        String a = Integer.toString(n);
        String b = Integer.toString(m);
        if(b.substring(1,b.length()).equals(a)){
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }
}
