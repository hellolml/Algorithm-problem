package January;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(isPalindrome(x)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuffer a = stringBuffer.reverse();
        String b = String.valueOf(a);
        if (s.equals(b)) {
            return true;
        }
        return false;
    }
}
