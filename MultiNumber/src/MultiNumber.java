import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MultiNumber {
	
	public String check(int number) {
		if(number <= 9) {
			return "NO";
		}
		int x = number;
		int N = 0;
		ArrayList<Integer> digits = new ArrayList<>();
		while (x != 0) {
			digits.add(x%10);
			x/=10;
			N++;
		}
		int dp[][] =  new int[2][N];
		dp[0][0] = digits.get(0);
		dp[1][N-1] = digits.get(N-1);
		for(int i=1; i<N; i++) {
			dp[0][i] = dp[0][i-1] * digits.get(i);
			dp[1][N-1-i] = dp[1][N-i] * digits.get(N-1-i);
		}
		for(int i=0; i<N-1; i++) {
			if(dp[0][i] == dp[1][i+1])
				return "YES";
		}
		return "NO";
	}
}
