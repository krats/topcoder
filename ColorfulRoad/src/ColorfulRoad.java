import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ColorfulRoad {
	
	public int getMin(String road) {
		int N = road.length();
		int[] dp = new int[N];
		dp[0] = 0;
		for (int i = 1; i < N; i++) {
			int current = Integer.MAX_VALUE;
			for(int j=i-1; j>=0; j--) {
				if(road.charAt(i) == 'B' && road.charAt(j) == 'G' && dp[j] != Integer.MAX_VALUE) {
					current = Math.min(current, (j-i)*(j-i) + dp[j]);
				}
				else if(road.charAt(i) == 'G' && road.charAt(j) == 'R' && dp[j] != Integer.MAX_VALUE) {
					current = Math.min(current, (j-i)*(j-i) + dp[j]);
				}
				else if(road.charAt(i) == 'R' && road.charAt(j) == 'B' && dp[j] != Integer.MAX_VALUE) {
					current = Math.min(current, (j-i)*(j-i) + dp[j]);
				}
			}
			dp[i] = current;
		}
		return dp[N-1] == Integer.MAX_VALUE ? -1: dp[N-1];
	}
}
