package November;

import java.util.*;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
//        Scanner sc = new Scanner(System.in);
//        AB[0] = sc.nextInt();
//        AB[1] = sc.nextInt();
        AB[0] = AB[0]+AB[1];
        AB[1] = AB[0]-AB[1];
        AB[0] = AB[0]-AB[1];
        return AB;
    }

}