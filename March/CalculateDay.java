package March;

import java.util.Scanner;

public class CalculateDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if (month > 12 || day > 31 || year < 0 || month < 0 || day < 0) {
                System.out.println(-1);
            }
            for (int i = 1; i < month; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    day += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    day += 30;
                } else if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    day += 29;
                } else {
                    day += 28;
                }
            }
            System.out.println(day);
        }
    }
}
