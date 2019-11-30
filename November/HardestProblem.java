package November;

import java.util.Scanner;

public class HardestProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
        String password = sc.nextLine();
            char[] poyi = new char[password.length()];
            for (int i = 0; i < password.length(); i++) {
                poyi[i] = password.charAt(i);
            }
            for (int i = 0; i < poyi.length; i++) {
                char a = poyi[i];
                if (a != ' ') {
                    if (a > 'E') {
                        System.out.print((char) (a - 5));
                    } else {
                        System.out.print((char) (a - 65 + 86));
                    }
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
