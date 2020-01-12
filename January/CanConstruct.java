package January;

import java.util.Scanner;

public class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        for (int i = 0; i <ransomNote.length() ; i++) {
            for (int j = 0; j <magazine.length() ; j++) {
                if(magazine.charAt(j)==ransomNote.charAt(i)){
                     count++;
                }
            }
        }
        if(count>=ransomNote.length()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();
        if(canConstruct(ransomNote, magazine)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
