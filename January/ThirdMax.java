package January;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int [] a = new int[hashSet.size()];
        int count = 0;
        for (int set:hashSet) {
          a[count++] = set;
        }
        Arrays.sort(a);
            if(a.length<3){
            return a[a.length-1];
        }else {
            return a[a.length-3];
        }
    }
}
