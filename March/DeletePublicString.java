package March;

import java.util.Scanner;

public class DeletePublicString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length() ; i++) {
            if(a.charAt(i)==' '||!b.contains(String.valueOf(a.charAt(i)))){
                sb.append(a.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
