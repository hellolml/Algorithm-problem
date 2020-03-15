package March;

import java.util.Scanner;

public class Count2 {
    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for(int i = 0;i<=n;i++){
            String s = String.valueOf(i);
            for(int j = 0;j<s.length();j++){
                if(String.valueOf(s.charAt(j)).equals("2")){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumberOf2s(n));
    }
}
