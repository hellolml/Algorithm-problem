package December;

import java.util.Scanner;

public class MaxGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] num = new int[N];
            for (int i = 0; i < N; i++) {
                num[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                String select = sc.next();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int ret = 0;
                int A0 = A;
                int B0 = B;
                if (B0 > A0) {
                    int temp = A0;
                    A0 = B0;
                    B0 = temp;
                }
                if (select.equals("Q")) {
                    for (int j = B0-1; j < A0; j++) {
                        ret = Math.max(ret, num[j]);
                    }
                    System.out.println(ret);
                } else if (select.equals("U")) {
                    num[A - 1] = B;
                }
            }
        }
    }
}
