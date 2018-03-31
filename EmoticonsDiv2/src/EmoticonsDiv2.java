import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EmoticonsDiv2 {
	
	public int printSmiles(int smiles) {
		int[] dp = new int[smiles+3];
		int[] current = new int[smiles+3];
		dp[1] = 0;
		current[1] = 0;
		dp[2] = 2;
		current[2] = 1;
		for (int i = 3; i <= smiles; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j=i-1; j>=2; j--) {
				if((i - j) % current[j] == 0 && dp[j] + (i-j)/current[j] < dp[i]) {
					dp[i] = dp[j] + (i-j)/current[j];
					current[i] = current[j];
				}

				if(i%j == 0 && dp[j] + i/j < dp[i]) {
					dp[i] = dp[j] + i/j;
					current[i] = j;
				}
			}
		}
		return dp[smiles];
	}
}
