package March;

import java.util.Scanner;

public class FindMoney {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String []s1 = sc.next().split("\\.");
         String []s2 = sc.next().split("\\.");
         int a = Integer.parseInt(s1[0])*29*17+Integer.parseInt(s1[1])*29+Integer.parseInt(s1[2]);
         int b = Integer.parseInt(s2[0])*29*17+Integer.parseInt(s2[1])*29+Integer.parseInt(s2[2]);
         int money = b-a;
         int x =money/(29*17);
         int y =Math.abs(money%(29*17)/29);
         int z =Math.abs(money%(29*17)%29);
         System.out.println(x+"."+y+"."+z);
    }
}