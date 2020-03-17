package March;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        StringBuilder s = new StringBuilder(x);
        String str = String.valueOf(s.reverse());
        StringBuilder s3;
        StringBuilder ss = new StringBuilder();
        String[] strings = str.split("[^a-zA-Z]+");
        for (int i = 0; i < strings.length; i++) {
            s3 = new StringBuilder(strings[i]);
            strings[i] = String.valueOf(s3.reverse());
        }
        for (int i = 0; i < strings.length; i++) {
            ss.append(strings[i]);
            if (i < strings.length - 1) {
                ss.append(" ");
            }
        }
        System.out.println(ss.toString().trim());
    }
}
