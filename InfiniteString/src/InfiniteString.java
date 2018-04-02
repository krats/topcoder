import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class InfiniteString {
	
	public String equal(String s, String t) {
		int n = s.length();
		int m = t.length();
		StringBuilder first = new StringBuilder();
		for (int i = 0; i < m; i++) {
			first.append(s);
		}
		StringBuilder second = new StringBuilder();
		for (int i = 0; i < n; i++) {
			second.append(t);
		}
		if(first.toString().equals(second.toString()))
			return "Equal";
		else
			return "Not equal";
	}
}
