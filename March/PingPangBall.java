package March;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PingPangBall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.next();
            String B = sc.next();
            int flag = 0;
            if (B.length() == 0) {
                System.out.println("Yes");
                flag++;
            }
            if (B.length() > A.length()) {
                System.out.println("No");
                flag++;
            }
            Map<Character, Integer> mapA = new HashMap<>();
            for (int i = 0; i < A.length(); i++) {
                if (mapA.containsKey(A.charAt(i))) {
                    mapA.put(A.charAt(i), mapA.get(A.charAt(i))+1);
                } else {
                    mapA.put(A.charAt(i), 1);
                }
            }
            for (int i = 0; i < B.length(); i++) {
                if (!mapA.containsKey(B.charAt(i))) {
                    if (flag == 0) {
                        System.out.println("No");
                    }
                    flag++;
                    break;
                } else {
                    mapA.put(B.charAt(i), mapA.get(B.charAt(i))-1);
                    if(mapA.get(B.charAt(i))<0){
                        if(flag==0) {
                            System.out.println("No");
                        }
                        flag++;
                        break;
                    }
                }
            }
            if(flag==0) {
                System.out.println("Yes");
            }
        }
    }
}
