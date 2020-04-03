package March;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        // write code here
        List<String> list = new LinkedList<>();
        for (int i = 0; i <length ; i++) {
            list.add(String.valueOf(iniString.charAt(i)));
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(" ")){
                list.remove(i);
                list.add(i,"%20" );
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s:list){
            sb.append(s);
        }
        return String.valueOf(sb);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = sc.nextInt();
        System.out.println(replaceSpace(s, len));
    }
}
