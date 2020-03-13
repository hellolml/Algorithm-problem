package March;

import java.util.Scanner;

public class AddReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length() - 1; i++) {
                for (int j = 0; j <= 26; j++) {
                    sb.insert(i, (char) ('a' + j));
                    String sb2 = String.valueOf(sb);
                    sb.reverse();
                    if (sb2.equals(String.valueOf(sb))) {
                        System.out.println("YES");
                        return;
                    } else {
                        sb.deleteCharAt(sb.length() - 1 - i);
                        sb.reverse();
                    }
                }
            }
            System.out.println("NO");
        }
    }
}
