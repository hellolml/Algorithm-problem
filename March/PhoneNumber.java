package March;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PhoneNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            Set<String> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine().replaceAll("-", "");
                for (int j = 0; j < s.length(); j++) {
                    if (j == 3) {
                        sb.append('-');
                    }
                    if (s.charAt(j) == 'A' || s.charAt(j) == 'B' || s.charAt(j) == 'C') {
                        sb.append(2);
                    } else if (s.charAt(j) == 'D' || s.charAt(j) == 'E' || s.charAt(j) == 'F') {
                        sb.append(3);
                    } else if (s.charAt(j) == 'G' || s.charAt(j) == 'H' || s.charAt(j) == 'I') {
                        sb.append(4);
                    } else if (s.charAt(j) == 'J' || s.charAt(j) == 'K' || s.charAt(j) == 'L') {
                        sb.append(5);
                    } else if (s.charAt(j) == 'M' || s.charAt(j) == 'O' || s.charAt(j) == 'N') {
                        sb.append(6);
                    } else if (s.charAt(j) == 'P' || s.charAt(j) == 'Q' || s.charAt(j) == 'R' || s.charAt(j) == 'S') {
                        sb.append(7);
                    } else if (s.charAt(j) == 'T' || s.charAt(j) == 'U' || s.charAt(j) == 'V') {
                        sb.append(8);
                    } else if (s.charAt(j) == 'W' || s.charAt(j) == 'X' || s.charAt(j) == 'Y' || s.charAt(j) == 'Z') {
                        sb.append(9);
                    } else {
                        sb.append(s.charAt(j));
                    }
                }
                if (sb.length() == 8) {
                    set.add(sb.toString());
                }
                sb.delete(0,sb.length());
            }
            System.out.println();
            for (String se : set) {
                System.out.println(se);
            }
        }
    }
}
