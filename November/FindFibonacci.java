package November;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class FindFibonacci {
    //static List<Integer> list = new ArrayList<>();

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0, f2 = 1;
//        int count = 0;
//        int count1 = 0;
        while (f2<=n){
            int f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        System.out.println((f2-n)>(n-f1)?n-f1:f2-n);


//        if (panduan(n)) {
//            count = 0;
//        } else {
//            int m = n;
//            while (!panduan(n)) {
//                n--;
//                count++;
//            }
//            while (!panduan(m)) {
//                m++;
//                count1++;
//            }
//        }
//        System.out.println(count < count1 ? count : count1);
    }

//    public static boolean panduan(int n) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i) == n) {
//                return true;
//            }
//        }
//        return false;
//    }
}
