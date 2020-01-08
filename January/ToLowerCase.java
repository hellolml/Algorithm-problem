package January;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToLowerCase {
    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);
        String string  = scanner.next();
        System.out.println(toLowerCase(string));
    }
    public static String toLowerCase(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                char a = (char) (str.charAt(i)+32);
                list.add(a);
            }else {
                list.add(str.charAt(i));
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <list.size() ; i++) {
            stringBuffer.append(list.get(i));
        }
        return String.valueOf(stringBuffer);
    }
}
