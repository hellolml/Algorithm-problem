package November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NekesiteThero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }

    public static String GetSequeOddNum(int m) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            sum += i;
        }
        int a = 1;
        list.add(1);
        for (int i = 1; i < sum; i++) {
            a += 2;
            list.add(a);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = list.size() - m; i < list.size() - 1; i++) {
            stringBuffer.append(list.get(i));
            stringBuffer.append('+');
        }
        stringBuffer.append(list.get(list.size() - 1));
        return stringBuffer.toString();
    }
}
