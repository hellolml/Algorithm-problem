package December;

import java.util.Scanner;

public class GradePoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] studyFen = new int[n];
            int[] grade = new int[n];
            float point = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                studyFen[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                grade[i] = sc.nextInt();
            }
            for (int i = 0; i < grade.length; i++) {
                if (grade[i] >= 90 && grade[i] <= 100) {
                    point += 4.0 * studyFen[i];
                } else if (grade[i] >= 85 && grade[i] <= 89) {
                    point += 3.7 * studyFen[i];
                } else if (grade[i] >= 82 && grade[i] <= 84) {
                    point += 3.3 * studyFen[i];
                } else if (grade[i] >= 78 && grade[i] <= 81) {
                    point += 3.0 * studyFen[i];
                } else if (grade[i] >= 75 && grade[i] <= 77) {
                    point += 2.7 * studyFen[i];
                } else if (grade[i] >= 72 && grade[i] <= 74) {
                    point += 2.3 * studyFen[i];
                } else if (grade[i] >= 68 && grade[i] <= 71) {
                    point += 2.0 * studyFen[i];
                } else if (grade[i] >= 64 && grade[i] <= 67) {
                    point += 1.5 * studyFen[i];
                } else if (grade[i] >= 60 && grade[i] <= 63) {
                    point += 1.0 * studyFen[i];
                } else if (grade[i] < 60) {
                    point += 0;
                }
            }
            for (int i = 0; i < studyFen.length; i++) {
                sum += studyFen[i];
            }
            System.out.printf("%.2f", point / sum);
        }
    }
}
