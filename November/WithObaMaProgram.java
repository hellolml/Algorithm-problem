package November;

import java.util.Scanner;

public class WithObaMaProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            String s = sc.next();
            for (int i = 0; i < a; i++) {
                System.out.print(s);
            }
            System.out.println();
            for (int i = 0; i < Math.ceil(a) / 2 - 2; i++) {
                System.out.print(s);
                for (int j = 0; j < a - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(s);
            }
            for (int i = 0; i < a; i++) {
                System.out.print(s);
            }
        }
    }
}
