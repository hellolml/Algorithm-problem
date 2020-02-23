package January;

import java.util.Scanner;

public class Sloution2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int a = 0;
        int flag = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count++;
                if(a<count){
                    a = count;
                    flag = i;
                }
            }else {
                count =0 ;
            }
            System.out.println(str.substring(flag-a+1, a+1));
        }
    }
}
