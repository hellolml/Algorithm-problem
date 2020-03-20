package March;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RenWu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int pi = 0;
        int qi = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < k; j++) {
                if (list.get(j) <= m) {
                    pi += p;
                    m -= list.get(j);
                    flag++;
                } else {
                    break;
                }
                if (flag ==k) {
                    qi += q;
                }
            }
        }
        System.out.println(pi + qi);
    }
}
