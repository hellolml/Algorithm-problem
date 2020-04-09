package April;

import java.util.Scanner;

public class BuyLiWu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = n % m;
        int count;
        if (n > m && n % m == 0) {
            if (a <= b) {
                System.out.println((n - m) * a);
            } else {
                System.out.println((n - m) * b);
            }
        } else if (n < m && n % m != 0) {
            if (a <= b) {
                System.out.println((n - (m - n)) * a);
            } else {
                System.out.println((n - (m - n)) * b);
            }
        } else if (x != 0) {
            if (a <= b) {
                count = x * a;
            } else {
                count = x * b;
            }
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}
