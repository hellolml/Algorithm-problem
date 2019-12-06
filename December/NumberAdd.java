package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            long num2 = num * num;
            int he1 = 0;
            double he2 = 0;
            int j = 0;
            int k = 0;
            List<Integer> list = new ArrayList<>();
            List<Long> list1 = new ArrayList<>();
            for (int i = num; i > 0; i = i / 10) {
                int jieshou = i % 10;
                i = i - jieshou;
                list.add(jieshou);
            }
            for (int i = 0; i < list.size(); i++) {
                he1 += list.get(i);
            }
            for (long i = num2; i > 0; i = i / 10) {
                long jieshou2 = i % 10;
                i = i - jieshou2;
                list1.add(jieshou2);
            }
            for (int i = 0; i < list1.size(); i++) {
                he2 += list1.get(i);
            }
            System.out.printf("%d %.0f", he1, he2);
        }
    }
}
