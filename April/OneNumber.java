package April;

import java.util.*;

public class OneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Integer number : map.keySet()) {
            if (map.get(number) % 2 != 0) {
                list.add(number);
            }
        }
        Collections.sort(list);
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
