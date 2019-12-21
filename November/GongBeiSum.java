package November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GongBeiSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        List<Integer> list = new ArrayList<>();
        if(a<0&&b<0){
            return;
        }
            if (a == 0 && b == 0) {
                System.out.println(0);
            }
            for (i = a*b;i>0;i--){
                if(i%a==0&&i%b==0){
                    list.add(i);
                }
            }
            System.out.println(list.get(list.size()-1));
    }
}
