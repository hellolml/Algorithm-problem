package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindX {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();
        int flag = 0;
        for (int i = 0;i<list.size();i++){
            if(list.get(i)==x){
                System.out.println(i);
                flag++;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
