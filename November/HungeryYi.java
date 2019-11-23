package November;
//链接：https://www.nowcoder.com/questionTerminal/5ee8df898312465a95553d82ad8898c3
//        来源：牛客网
//
//        4x + 3等于做了两次2x + 1， 8x + 7做了三次。
//
//        从起点开始令x0 = 2*x0 + 1，统计做了多少次2x + 1后模1000000007等于0
//
//        再把次数分解成若干个3与2的和，3的个数加上2的个数最小，不超过100000
import java.util.Scanner;

public class HungeryYi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x0 = in.nextInt();
        in.close();
        int count = 0;
        while (x0 != 0 && count <= 300000) {
            x0 = ((x0 << 1) + 1) % 1000000007;
            count++;
        }
        int res = (count + 2) / 3;
        System.out.println(res > 100000 ? -1 : res);
    }
}