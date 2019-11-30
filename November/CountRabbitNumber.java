package November;

import java.util.Scanner;

public class CountRabbitNumber {
    public static int getTotalCount(int monthCount) {
        if (monthCount == 0) {
            return 0;
        }
        if (monthCount == 1 || monthCount == 2) {
            return 1;
        }
        return getTotalCount(monthCount - 1) + getTotalCount(monthCount - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int month = sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }
}
