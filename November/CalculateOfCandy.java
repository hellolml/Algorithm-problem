package November;

import java.util.Scanner;

public class CalculateOfCandy {
    public static void main(String args[]){
        int A,B,C;
        Scanner sc = new Scanner(System.in);
        int []a = new int[4]; 
        for (int i = 0;i<4;i++){
            a[i]=sc.nextInt();
        }
        A = (a[0]+a[2])/2;
        C = (a[3]-a[1])/2;
        B = A-a[0];
        if(A-B==a[0]&&B-C==a[1]&&A+B==a[2]&&B+C==a[3]){
            System.out.println(A+" "+B+" "+C);
        }else {
            System.out.println("No");
        }
    }
}
