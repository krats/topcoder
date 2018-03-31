import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AttendanceShort {
	
	public String[] shortList(String[] names, String[] attendance) {
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0; i<names.length; i++) {
			int countP = 0;
			int countA= 0;
			for (int j = 0; j < attendance[i].length(); j++) {
				if(attendance[i].charAt(j) == 'P') {
					countP++;
				} else if(attendance[i].charAt(j) == 'A') {
					countA++;
				}
			}
			double percent = ((double) countP*100)/(countA+countP);
			if(percent < 75) {
				ans.add(names[i]);
			}
		}
		String[] arr = new String[ans.size()];
		return ans.toArray(arr);
	}
}
