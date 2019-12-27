package November;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        int left = 0;
        for (int i=0;i<A.length();i++){
            char c = A.charAt(i);
            if(c=='('){
                left++;
            }else if(c==')'){
                left--;
            }else {
                return false;
            }
        }
        if(left==0)
            return true;
        else
            return false;
    }
}
