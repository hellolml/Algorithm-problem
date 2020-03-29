package March;

import java.util.Scanner;

public class JinzhiChange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(Integer.valueOf(s.substring(2, s.length()), 16));
        }
    }
}
