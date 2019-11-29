package November;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gift {
    public static int getValue(int[] gifts, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < gifts.length; i++) {
            list.add(gifts[i]);
        }
        Collections.sort(list);
        int count = 0;
        int money = list.get(list.size() / 2);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == money) {
                count++;
            }
        }
        if (count > n / 2) {
            return money;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gifts = new int[n];
        for (int i = 0; i < gifts.length; i++) {
            gifts[i] = scanner.nextInt();
        }
        System.out.println(getValue(gifts, n));
    }
}