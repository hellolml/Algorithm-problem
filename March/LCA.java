package March;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCA {
    public static int getLCA(int a, int b) {
        // write code here
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
        lista.add(a);
        listb.add(b);
        judge(a,lista );
        judge(b,listb );
        for(int a1:lista){
            for (int b1:listb){
                if(a1==b1){
                    return a1;
                }
            }
        }
        return 0;
    }
    public static void judge(int num,List<Integer> list){
        while(num>1){
            if(num%2==0) {
                num = num / 2;
                list.add(num);
            }else {
                num = (num-1)/2;
                list.add(num);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getLCA(a,b));
    }
}
