package January;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleArrary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int k = scanner.nextInt();
        while (scanner.hasNext()){
            list.add(scanner.nextInt());
        }
        int a = list.size();
        int nums [] = new int[a];
        for (int  i = 0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        rotate(nums,k );
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]);
        }
    }
    public static void rotate(int[] nums, int k) {
        int [] a = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            a[(k+i)%nums.length] = nums[i];
        }
        for (int i = 0;i<a.length;i++){
            nums[i]  = a[i];
        }
    }
}
