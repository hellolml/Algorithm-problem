package November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteString {
    public static void Compere(String b,String a) {
        List<Character> list = new ArrayList<>();
        for (int i= 0;i<b.length();i++){
            for (int j=0;j<a.length();j++){
              if(a.charAt(j)!=b.charAt(i)){
                  list.add(b.charAt(i));
              }
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        Compere(a,b);
    }
}
