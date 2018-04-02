import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LISNumberDivTwo {
	
	public int calculate(int[] seq) {
		int ans = 1;
		for (int i = 1; i < seq.length; i++) {
			if(seq[i] <= seq[i-1]) {
				ans++;
			}
		}
		return ans;
	}
}
