import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TrafficCongestionDivTwo {
	
	public long theMinCars(int treeHeight) {
		long[] dp = new long[treeHeight+3];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= treeHeight; i++) {
			dp[i] = 2*dp[i-1] + 1;
			for(int j = i-1; j >= 0; j--) {
				long current = 1;
				for(int k = j; k<=i-2; k++) {
					current += 2*dp[k];
				}
				if(j > 0) {
					current += (long) Math.pow(2,(i-j+1))*dp[j-1];
				}
				dp[i] = Math.min(dp[i], current);
			}
		}
		return dp[treeHeight];
	}
}
