package January;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        if(k>input.length){
            return list;
        }else {
            for (int i = 0; i < k; i++) {
                list.add(input[i]);
            }
            return list;
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
            int []input = new int[]{4,5,1,6,2,7,3,8};
            int k = 10;
            list=GetLeastNumbers_Solution(input, k);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }
}
