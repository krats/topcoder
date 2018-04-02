import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RGBStreet {
	
	public int estimateCost(String[] houses) {
		int N = houses.length;
		int[][] dp = new int[3][N+1];
		dp[0][0] = 0;
		dp[1][0] = 0;
		dp[2][0] = 0;
		for (int i = 1; i <= N; i++) {
			String[] prices = houses[i-1].split("\\s+");
			dp[0][i] = Math.min(dp[1][i-1], dp[2][i-1]) + Integer.parseInt(prices[0]);
			dp[1][i] = Math.min(dp[2][i-1], dp[0][i-1]) + Integer.parseInt(prices[1]);
			dp[2][i] = Math.min(dp[1][i-1], dp[0][i-1]) + Integer.parseInt(prices[2]);
		}
		return Math.min(Math.min(dp[0][N], dp[1][N]), dp[2][N]);
	}
}
