package December;

import java.util.Scanner;

public class IpChange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.contains(".")) {
                String ip[] = str.split("\\.");
                long[] p = new long[ip.length];
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < ip.length; i++) {
                    p[i] = Long.parseLong(ip[i]);
                    String s = Long.toBinaryString(p[i]);
                    String sp = String.format("%08d", Long.parseLong(s));
                    stringBuffer.append(sp);
                }
                Long a = Long.parseLong(stringBuffer.toString(), 2);
                System.out.println(a);
            } else {
                Long a = Long.parseLong(str);
                String b = Long.toBinaryString(a);
                int len = b.length();
                StringBuffer sb = new StringBuffer(b);
                for (int i = 0; i < 32 - len; i++) {
                    sb.insert(0, "0");
                }
                long one = Long.valueOf(sb.substring(0, 8), 2);
                long two = Long.valueOf(sb.substring(8, 16), 2);
                long three = Long.valueOf(sb.substring(16, 24), 2);
                long four = Long.valueOf(sb.substring(24, sb.length()), 2);
                System.out.println(one + "." + two + "." + three + "." + four);
            }
        }
    }
}
