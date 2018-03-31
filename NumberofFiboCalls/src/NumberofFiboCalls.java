import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumberofFiboCalls {
	
	public int[] fiboCallsMade(int n) {
		int[][] dp = new int[2][n+3];
		dp[0][0] = 1;
		dp[1][0] = 0;
		dp[0][1] = 0;
		dp[1][1] = 1;
		for(int i=2; i<=n; i++) {
			dp[0][i] = dp[0][i-1] + dp[0][i-2];
			dp[1][i] = dp[1][i-1] + dp[1][i-2];
		}
		return new int[] { dp[0][n], dp[1][n] };
	}
}
