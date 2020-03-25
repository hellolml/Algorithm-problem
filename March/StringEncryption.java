package March;

import java.util.Scanner;

public class StringEncryption {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            StringBuilder a1 = new StringBuilder();
            StringBuilder b1 = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= 'a' && a.charAt(i) < 'z') {
                    char c = Character.toUpperCase(a.charAt(i));
                    a1.append((char) (c + 1));
                } else if (a.charAt(i) >= 'A' && a.charAt(i) < 'Z') {
                    char c = Character.toLowerCase(a.charAt(i));
                    a1.append((char) (c + 1));
                } else if (a.charAt(i) == 'z') {
                    a1.append('A');
                } else if (a.charAt(i) == 'Z') {
                    a1.append('a');
                } else if (a.charAt(i) >= '0' && a.charAt(i) < '9') {
                    int n = Integer.parseInt(String.valueOf(a.charAt(i))) + 1;
                    a1.append(n);
                } else if (a.charAt(i) == '9') {
                    a1.append(0);
                } else {
                    a1.append(a.charAt(i));
                }
            }
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) > 'a' && b.charAt(i) <= 'z') {
                    char c = Character.toUpperCase(b.charAt(i));
                    b1.append((char) (c - 1));
                } else if (b.charAt(i) > 'A' && b.charAt(i) <= 'Z') {
                    char c = Character.toLowerCase(b.charAt(i));
                    b1.append((char) (c - 1));
                } else if (b.charAt(i) == 'a') {
                    b1.append('Z');
                } else if (b.charAt(i) == 'A') {
                    b1.append('z');
                } else if (b.charAt(i) > '0' && b.charAt(i) <= '9') {
                    int n = Integer.parseInt(String.valueOf(b.charAt(i))) - 1;
                    b1.append(n);
                } else if (b.charAt(i) == '0') {
                    b1.append(9);
                } else {
                    b1.append(b.charAt(i));
                }
            }
            System.out.println(a1.toString());
            System.out.println(b1.toString());
        }
    }
}
