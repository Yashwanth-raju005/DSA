import java.util.*;
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i : digits) {
            sb.append(i);
        }

        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        char[] ch = num.toString().toCharArray();

        int[] ans = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            ans[i] = ch[i] - '0';
        }

        return ans;
    }
}