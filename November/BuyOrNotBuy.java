package November;

import java.util.Scanner;

public class BuyOrNotBuy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int leng = A.length() - B.length();
        int noHas = 0;
        for (int i = 0; i < B.length(); i++) {
            int count = 0;
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i) == A.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                noHas++;
            }
        }
        if (noHas == 0) {
            System.out.println("Yes" + " " + leng);
        } else {
            System.out.println("No" + " " + noHas);
        }
    }
}
