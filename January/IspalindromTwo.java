package January;

import java.util.Scanner;

public class IspalindromTwo {
    public static boolean isPalindrome(String s) {
        int count = 0, j = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || chars.length >= '0' && chars[i] <= '9'||chars[i]==' ') {
                chars[count++] = chars[i];
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[count++] = (char) (chars[i] + 32);
            }
        }
        String s1 = String.valueOf(chars);
        StringBuilder s2 =  new StringBuilder(s1);
        StringBuilder s3 = s2.reverse();
        String s4 = String.valueOf(s3);
        if(s1.equals(s4)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}

