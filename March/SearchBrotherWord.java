package March;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchBrotherWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            List<String> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.next());
            }
            String s = sc.next();
            int m = sc.nextInt();
            sc.hasNextLine();
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                int flag = 0;
                for (int i = 0; i < list.get(j).length(); i++) {
                    if (!s.contains(String.valueOf(list.get(j).charAt(i)))) {
                        flag++;
                        break;
                    }
                }
                if (flag == 0) {
                    if (!list.get(j).equals(s)) {
                        count++;
                        list1.add(list.get(j));
                    }
                }
            }
            Collections.sort(list1);
            System.out.printf(count + "\t");
            for (int i = 0; i <m ; i++) {
                System.out.println(list1.get(i));
            }
        }
    }
}
