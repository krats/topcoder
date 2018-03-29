import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ShorterSuperSum {
	
	public int calculate(int k, int n) {
		int[][] dp = new int[k+1][n+1];
		for(int i=0; i<=n; i++) {
			dp[0][i] = i;
		}
		for(int i=1; i<=k; i++) {
			dp[i][0] = dp[i-1][0];
			for(int j=1; j<=n; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j];
			}
		}
		return dp[k][n];
	}
}
