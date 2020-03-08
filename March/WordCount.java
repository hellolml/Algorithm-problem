package March;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        String s = sc.nextLine();
        for (int j = 0;j<26;j++){
            map.put((char)(j+'A'), 0);
        }
        for (int i = 0;i<s.length();i++){
            int count = 0;
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                if(map.containsKey(s.charAt(i))){
                    count = map.get(s.charAt(i));
                    map.put(s.charAt(i),count+1 );
                }else {
                    map.put(s.charAt(i),1 );
                }
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Character  key = (Character) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println( key + ":" + value);
        }
    }
}
