package January;

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int len  = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(!s.contains(" ")){
                return s.length();
            }else if(s.charAt(i)==' '){
                len = s.length()-1-i;
                break;
            }
        }
        return len;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
