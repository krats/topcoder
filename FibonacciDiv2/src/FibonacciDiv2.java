import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FibonacciDiv2 {
	
	public int find(int N) {
		int a = 0;
		int b = 1;
		while (b < N) {
			int c = a + b;
			a = b;
			b = c;
		}
		return Math.min(N - a, b - N);
	}
}
