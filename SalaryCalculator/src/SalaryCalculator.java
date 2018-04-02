import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SalaryCalculator {
	
	public double calcHours(int P1, int P2, int salary) {
		double ans = (salary*1.0)/P1;
		if(ans > 200) {
			ans = 200;
			salary -= P1 * 200;
			ans += (salary*1.0) / P2;
		}
		return ans;
	}
}
