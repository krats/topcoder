import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DivFreed2 {

    public int count(int n, int k) {
        long[][] dp = new long[n + 3][k + 1];
        int MODULO = 1000000007;
        for (int i = 0; i <= k; i++) {
            dp[1][i] = 1;
        }
        long prevSum = k;
        long currentSum = 0;
        for (int i = 2; i <= n; i++) {
            currentSum = 0;
            for (int j = 1; j <= k; j++) {
                long current = prevSum;
                for (int l = 2*j; l <= k; l += j) {
                    current = (current - dp[i - 1][l]) % MODULO;
                }
                dp[i][j] = current;
                currentSum = (current + currentSum) % MODULO;
            }
            prevSum = currentSum;
        }
        long ans = 0;
        for (int i = 1; i <= k; i++) {
            ans = (ans + dp[n][i]) % MODULO;
        }
        return (int) ans;
    }
}
