package December;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigNumberSort {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<BigInteger> list = new ArrayList<>();
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                BigInteger num = scanner.nextBigInteger();
                list.add(num);
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
