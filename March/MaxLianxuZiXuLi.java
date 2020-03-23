package March;

import java.util.Scanner;

public class MaxLianxuZiXuLi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0],sum = a[0];
        for (int i = 1; i < a.length; i++) {
            if(sum+a[i]>a[i]){
                sum = sum+a[i];
            }else {
                sum = a[i];
            }
            if(sum>max)
                max = sum;
        }
        System.out.println(max);
    }
}
