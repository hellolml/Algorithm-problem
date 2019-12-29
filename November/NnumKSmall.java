package November;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NnumKSmall {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num;
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        num = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        Collections.sort(list);
        for (int i = 0; i < num; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
