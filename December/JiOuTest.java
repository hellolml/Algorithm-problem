package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JiOuTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            List<Integer> list = new ArrayList<>();
            List<String> list1 = new ArrayList<>();
            String a = sc.nextLine();
            for (int i = 0; i < a.length(); i++) {
                char x = a.charAt(i);
                int y = (int) (x - '\0');
                list.add(y);
            }
            for (int i = 0; i < list.size(); i++) {
                String c = Integer.toBinaryString(list.get(i));
                String d = String.format("%07d", Integer.parseInt(c));
                if (list.get(i)%2!= 0) {
                    d = "1" + d;
                    list1.add(d);
                } else{
                    d = "0" + d;
                    list1.add(d);
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }
        }
    }
}
