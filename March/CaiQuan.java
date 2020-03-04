package March;

import java.util.Scanner;

public class CaiQuan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int awC = 0,awB =0,awJ = 0;
        int bwC = 0,bwB = 0,bwJ = 0;
        int pin = 0;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String a = sc.next();
            String b = sc.next();
            if(a.equals("C")&&b.equals("J")){
                awC++;
            }else if(a.equals("J")&&b.equals("B")){
                awJ++;
            }else if(a.equals("B")&&b.equals("C")){
                awB++;
            }else if(a.equals("J")&&b.equals("C")){
                bwC++;
            }else if(a.equals("B")&&b.equals("J")){
                bwJ++;
            }else if(a.equals("C")&&b.equals("B")){
                bwB++;
            }
            else if(a.equals("C")&&b.equals("C")||a.equals("J")&&b.equals("J")||a.equals("B")&&b.equals("B")){
                pin++;
            }else {
                System.out.println("错误");
            }
        }
        int aw = awB+awC+awJ;
        int bw = bwB+bwC+bwJ;
        int ad = n-aw-pin;
        int bd = n-bw-pin;
        System.out.println(aw+" "+pin+" "+ad);
        System.out.println(bw+" "+pin+" "+bd);
        max(awB,awC ,awJ );
        System.out.print(" ");
        max(bwB,bwC ,bwJ );
    }
    private static void max(int B,int C,int J){
        if(B>C&&B>J){
            System.out.print("B");
        }else if(J>C&&J>B){
            System.out.print("J");
        }else if(C>B&&C>J){
            System.out.print("C");
        }else if((B==C&&B>J)||(B==C&&C==J)||(B==J&&B>C)){
           System.out.print("B");
        }else if(C==J&&C>B){
            System.out.print("C");
        }else {
            System.out.print("错误");
        }
    }
}
