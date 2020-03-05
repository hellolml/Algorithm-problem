package March;

import java.util.*;

public class KeyBoard {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0;i<a.length();i++){
            if(!b.contains(String.valueOf(a.charAt(i)))){
                if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
                    char x = Character.toUpperCase(a.charAt(i));
                    set.add(x);
                }else {
                    set.add(a.charAt(i));
                }
            }
        }
        for(Character character: set){
            System.out.print(character);
        }
    }
}
