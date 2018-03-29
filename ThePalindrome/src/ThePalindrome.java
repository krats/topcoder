import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThePalindrome {
	
	public int find(String s) {
		int N = s.length();
		boolean[][] dp = new boolean[N][N];
		for (int len = 1; len <= N; len++) {
			for (int i = 0; i <= N - len; i++) {
				int j = i + len -1;
				if(len == 1) {
					dp[i][j] = true;
				} else if (len == 2) {
					dp[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
				}
			}
		}
		boolean isPalindrome = false;
		int items = 0;
		while (!isPalindrome) {
			if(dp[items][N-1]) {
				isPalindrome = true;
			}
			items ++;
		}
		items--;
		return N + items;
	}
}
