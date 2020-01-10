package January;

import java.util.Scanner;

public class RemoveArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[100];
        int i = 0;
        int val = scanner.nextInt();
        while (scanner.hasNext()){
            nums[i++] = scanner.nextInt();
        }
        int len = removeElement(nums, val);
        for (int j = 0;j<nums.length;j++){
            System.out.print(nums[j]);
        }
    }
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
