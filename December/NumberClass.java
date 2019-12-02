package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        double[] a = new double[5];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        double sum = 0;
        int count = 0;
        int max = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 5 == 0 && list.get(i) % 2 == 0) {
                a[0] += list.get(i);
            }
            if (list.get(i) % 5 == 1) {
                a[1] += list.get(i) * Math.pow(-1, j);
                j++;
            }
            if (list.get(i) % 5 == 2) {
                a[2]++;
            }
            if (list.get(i) % 5 == 3) {
                count++;
                sum += list.get(i);
                double avg = sum / count;
                a[3] = avg;
            }
            if (list.get(i) % 5 == 4) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
                a[4] = max;
            }
        }
        if (a[0] == 0.0) {
            System.out.print("N" + " ");
        } else {
            System.out.printf("%.0f", a[0]);
            System.out.print(" ");
        }
        if (a[1] == 0.0) {
            System.out.print("N" + " ");
        } else {
            System.out.printf("%.0f", a[1]);
            System.out.print(" ");
        }
        if (a[2] == 0.0) {
            System.out.print("N" + " ");
        } else {
            System.out.printf("%.0f", a[2]);
            System.out.print(" ");
        }
        if (a[3] == 0.0) {
            System.out.print("N" + " ");
        } else {
            System.out.printf("%.1f", a[3]);
            System.out.print(" ");
        }
        if (a[4] == 0.0) {
            System.out.print("N" + " ");
        } else {
            System.out.printf("%.0f", a[4]);
        }
    }
}
