package November;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuyOrNotBuy2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int leng = A.length() - B.length();
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            int count = 0;
            if (map1.containsKey(A.charAt(i))) {
                count = map1.get(A.charAt(i));
                map1.put(A.charAt(i), count + 1);
            } else {
                map1.put(A.charAt(i), 1);
            }
        }
        int noHave = 0;
        for (int i = 0; i < B.length(); i++) {
            if (map1.containsKey(B.charAt(i))) {
                if (map1.get(B.charAt(i)) > 0) {
                    int count = map1.get(B.charAt(i));
                    map1.put(B.charAt(i), count - 1);
                } else {
                    noHave++;
                }
            } else {
                noHave++;
            }
        }
        if (noHave == 0) {
            System.out.println("Yes" + " " + leng);
        } else {
            System.out.println("No" + " " + noHave);
        }
    }
}
