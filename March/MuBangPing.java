package March;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MuBangPing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int select = sc.nextInt();
            int len = sc.nextInt();
            sc.nextLine();
            if(select==1){
                list.add(len);
            }else if(select == 2){
                list.remove(list.indexOf(len));
            }
            if(list.size()<3){
                System.out.println("No");
            }else {
                Collections.sort(list);
                int max = list.get(list.size()-1);
                int sum = 0;
                for (int j = 0; j <list.size() ; j++) {
                    sum+=list.get(j);
                }
                if((sum-max)>max){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
