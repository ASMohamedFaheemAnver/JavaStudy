import java.util.*;

public class Solution {
    static int maxXor(int l, int r, int k) {
        int max = 0;
        for(int i = l;i <= r;i++) {
            for(int j = l;j <= r;j++) {
                int a = i ^ j;
                if((a>max)&&(a<=k)&&(i<j)){
                    max = a;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        int _k;
        _k = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r, _k);
        System.out.println(res);

    }
}