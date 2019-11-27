package November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteNum {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > 1000) {
                num = 999;
            }
            for (int i = 0; i < num; i++) {
                list.add(i);
            }
            int j = 0;
            while (list.size() > 1) {
                j = (j + 2) % list.size();
                list.remove(j);
            }
            System.out.println(list.get(0));
        }
    }
}
