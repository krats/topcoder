import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TwoWaysSorting {
	
	public String sortingMethod(String[] stringList) {
		boolean lexicographically = true;
		boolean lengths = true;
		for(int i=1; i<stringList.length; i++) {
			if(stringList[i].length() < stringList[i-1].length())
				lengths = false;
			if(stringList[i-1].compareTo(stringList[i]) > 0) {
				lexicographically = false;
			}
		}
		if(lexicographically && lengths) {
			return "both";
		} else if(lexicographically) {
			return "lexicographically";
		} else if(lengths) {
			return "lengths";
		} else {
			return "none";
		}
	}
}
