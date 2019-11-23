package November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCount {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
            while (scanner.hasNext()) {
                int n = scanner.nextInt();
                if (n == 0) {
                    break;
                }
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int grade = scanner.nextInt();
                    list.add(grade);
                }
                int grade1 = scanner.nextInt();
                int count = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(grade1)) {
                        count++;
                    }
                }
                list1.add(count);
            }
            if (list1.isEmpty()){
                return;
            }
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }
        }
}
