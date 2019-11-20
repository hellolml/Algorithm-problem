package November;

import java.math.BigInteger;
import java.util.Scanner;

public class Culater0num {
    public static BigInteger jie(Integer n){
        Integer m = n;
        BigInteger bigInteger = new BigInteger("1");
        for(int i = 1; i <= m; i++){
            String temp1 = String.valueOf(i);
            BigInteger temp2 = new  BigInteger(temp1);
            bigInteger = bigInteger.multiply(temp2);
        }
        return bigInteger;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger m = jie(n);
        int count = 0;
        String str = String.valueOf(m);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
