package November;

import java.util.*;
public class Main{
    public static int searchSum(int n){
        List<Integer> list = new ArrayList<>();
        if(n<1&&n>100){
            return -1;
        }
        int m = 0;
        int num=0;
        for(int x=0;x<=n;x++){
            for(int y=0;y<=n;y++){
                num=6*x+8*y;
                if(n==num){
                    m = x+y;
                    list.add(m);
                }
            }
        }
        if(list.isEmpty()){
            return -1;
        }
        Collections.sort(list);
        return list.get(0);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(searchSum(n));
    }
}