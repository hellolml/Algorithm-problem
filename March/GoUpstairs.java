package March;

import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if(n<1) return 0;
        if(n==1)return 1;
        if(n==2)return 2;
        if(n==3)return 4;
        int a[] = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        for (int i = 3;i<n;i++){
            a[i] = ((a[i-1]+a[i-2])%1000000007+a[i-3])%1000000007;
        }
        return a[n-1];
    }
}