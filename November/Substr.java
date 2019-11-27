package November;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean []sub = new boolean[n];
        for (int i = 0;i<n;i++){
            sub[i] = s.contains(p[i]);
        }
        return sub;
    }
}
