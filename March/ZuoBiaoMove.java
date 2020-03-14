package March;

import java.util.Scanner;

public class ZuoBiaoMove {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] s1 = s.split(";");
            int x = 0, y = 0;
            for (int i = 0; i < s1.length; i++) {
                if (s1[i].length() >= 2 && isNumber(s1[i].substring(1))) {
                    if (s1[i].charAt(0) == 'A') {
                        x -= Integer.parseInt(s1[i].substring(1));
                    } else if (s1[i].charAt(0) == 'D') {
                        x += Integer.parseInt(s1[i].substring(1));
                    } else if (s1[i].charAt(0) == 'S') {
                        y -= Integer.parseInt(s1[i].substring(1));
                    } else if (s1[i].charAt(0) == 'W') {
                        y += Integer.parseInt(s1[i].substring(1));
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
    private static boolean isNumber(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
