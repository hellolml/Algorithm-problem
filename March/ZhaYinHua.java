package March;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ZhaYinHua {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }
        for (int i = 0;i<n;i++){
            list1.add(sc.nextInt());
        }
        Collections.sort(list);
        Collections.sort(list1);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = list.size()-1; i>list.size()-4 ; i--) {
            sum1+=list.get(i);
        }
        for (int i = list1.size()-1; i>list1.size()-4 ; i--) {
            sum2+=list1.get(i);
        }
        if(sum1==sum2){
            System.out.println(sum1);
        }else {
            System.out.println(Math.max(sum1,sum2 ));
        }
    }
}
