package November;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigHalfNumber {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int a = list.get(list.size()/2-1);
        System.out.println(a);
    }
}
