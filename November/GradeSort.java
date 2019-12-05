package November;

import java.util.*;

public class GradeSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int select = sc.nextInt();
        Integer grade;
        String name;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            name = sc.next();
            grade = sc.nextInt();

            map.put(name, grade);
        }
        if (select == 1) {
            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            for (Map.Entry<String, Integer> map1 : list) {
                System.out.println(map1.getKey() + " " + map1.getValue());
            }
        } else if (select == 0) {
            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            for (Map.Entry<String, Integer> map1 : list) {
                System.out.println(map1.getKey() + " " + map1.getValue());
            }
        }
    }
}
