package December;

import java.util.Scanner;

public class YearJiang {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            float bingo = (float) (count(n) / diGui(n)) * 100;
            System.out.println(String.format("%.2f", bingo) + "%");
        }
    }
    public static float diGui(int n){
        if(n==0){
            return 1;
        }else {
            return n * diGui(n - 1);
        }
    }
    public static float count(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
}
