import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumbersChallenge {
	
	public int MinNumber(int[] S) {
		Arrays.sort(S);
		int N = S.length;
		int sum = 0;
		for(int i=0; i<S.length; i++) {
			sum += S[i];
		}
		boolean[][] dp = new boolean[sum+1][N+1];
		for (int j = 0; j <= N; j++) {
			dp[0][j] = true;
		}
		for (int i = 1; i <= sum ; i++) {
			for (int j = 1; j <= N ; j++) {
				dp[i][j] = dp[i][j-1];
				if(S[j-1] <= i) {
					dp[i][j] = dp[i][j] || dp[i-S[j-1]][j-1];
				}
			}
			if(!dp[i][N]) {
				return i;
			}
		}
		return sum+1;
	}
}
