package November;

import java.util.*;

public class DNA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(sc.nextLine());
        int n = sc.nextInt();
        int max = 0;
        int index = 0;
        for (int i = 0; i < sb.length()-n; i++) {
            String sb0 =sb.substring(i,i+n);
            int count = 0;
            for (int j = 0;j< n;j++){
                if(sb0.charAt(j)=='G'||sb0.charAt(j)=='C') {
                    count++;
                }
            }
            if(count>max){
                max = count;
                index = i;
            }
        }
        System.out.println(sb.substring(index,index+n));
    }
}
