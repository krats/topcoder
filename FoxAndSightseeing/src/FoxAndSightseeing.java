import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndSightseeing {
	
	public int getMin(int[] position) {
		int N = position.length;
		int[] dp = new int[N];
		dp[0] = 0;
		for(int i=1; i<N; i++) {
			dp[i] = dp[i-1] + Math.abs(position[i]-position[i-1]);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=1; i<N-1; i++) {
			int current = dp[i-1] + dp[N-1] - dp[i+1] + Math.abs(position[i+1] - position[i-1]);
			if(current < ans) {
				ans = current;
			}
		}
		return ans;
	}
}
