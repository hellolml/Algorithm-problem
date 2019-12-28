package November;

public class ProductGrey {
    public String[] getGray(int n) {
        String[] str = null;
        if (n == 1) {
            str = new String[]{"0", "1"};
        } else {
            String[] str1 = getGray(n - 1);
            str = new String[2*str1.length];
            for (int i = 0; i < str1.length; i++) {
                str[i] = "0" + str1[i];
                str[str.length - 1-i] = "1" + str1[i];
            }
        }
        return str;
    }
}
