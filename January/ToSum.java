package January;

import java.util.HashMap;
import java.util.Map;

public class ToSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int count = target - nums[i];
            if(map.containsKey(count)){
                return new int[]{map.get(count),i};
            }
            map.put(nums[i],i );
        }
        throw new IllegalArgumentException("没有两个数相加等于target");
    }
}
