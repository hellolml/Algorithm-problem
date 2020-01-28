package January;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            int left = 0;
            for (int j = i-1; j>=0 ; j--) {
                left+=nums[j];
            }
            int right = 0;
            for (int j = i+1;j<nums.length;j++){
                right+=nums[j];
            }
            if(left == right){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] nums = new int[]{-1,-1,-1,0,1,1};
        System.out.println(pivotIndex(nums));
    }
}
