package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallYiUp {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int monsterNumber = sc.nextInt();
            int power = sc.nextInt();
            int[] moster = new int[monsterNumber];
            for (int i = 0; i < monsterNumber; i++) {
                moster[i] = sc.nextInt();
            }
            for (int i = 0; i < moster.length; i++) {
                if (power > moster[i]) {
                    power = power + moster[i];
                } else {
                    power = power + isPublicYueNum(power, moster[i]);
                }
            }
            list.add(power);
        }
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static int  isPublicYueNum(int xiaoYi,int monster){
        int num = 0;
        for (int i = xiaoYi;i>0;i--){
            if(xiaoYi%i==0&&monster%i==0){
                num = i;
                break;
            }
        }
        return num;
    }
}
