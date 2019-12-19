package November;

import java.util.Scanner;

public class ZhuangZai {
    private static int count = 0;
    private static int []weight;
    static int m;
    private static void zhuang(int s,int n){
        if(s==0){
            count++;
            return;
        }
        if(s<0||(s>0&&n<1)) {
            return;
        }
            zhuang(s-weight[n],n-1);
            zhuang(s,n-1);

        }
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()){
          m = scanner.nextInt();
          weight = new int[m+1];
          for (int i=1;i<=m;i++){
              weight[i] = scanner.nextInt();
          }
          zhuang(40, m);
          System.out.println(count);
      }
  }      
}
