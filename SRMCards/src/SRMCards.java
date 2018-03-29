import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SRMCards {
	
	public int maxTurns(int[] cards) {
		Arrays.sort(cards);
		int N = cards.length;
		int[][] ans = new int[2][N];
		for(int i = 0; i < N; i++){
			if( i-1 >= 0 && cards[i] == cards[i-1] + 1) {
				ans[0][i] = 1;
				if(i - 2 >= 0) {
					ans[0][i] += ans[0][i-2];
				}
			} else {
				ans[0][i] = 1;
				if(i - 1 >= 0) {
					ans[0][i] += ans[0][i-1];
				}
			}
			if( i+1 < N && cards[i] == cards[i+1] - 1) {
				ans[1][i] = 1;
				if(i + 2 < N) {
					ans[1][i] += ans[0][i+2];
				}
			} else {
				ans[1][i] = 1;
				if(i + 1 < N) {
					ans[1][i] += ans[0][i+1];
				}
			}
		}
		int maximium = 0;
		for(int i=0; i< N; i++) {
			int current = ans[0][i] + ans[1][i] - 1;
			if(current > maximium) {
				maximium = current;
			}
		}
		return maximium;
	}
}
