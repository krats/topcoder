import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EllysDirectoryListing {
	
	public String[] getFiles(String[] files) {
		boolean lastAvailable = true;
		for(int i = 0; i<files.length-2; i++) {
			if(files[i].equals(".")) {
				if(lastAvailable) {
					files[i] = files[files.length-1];
					files[files.length-1] = ".";
					lastAvailable = false;
				} else {
					files[i] = files[files.length-2];
					files[files.length-2] = ".";
				}
				i--;
			} else if(files[i].equals("..")) {
				if(lastAvailable) {
					files[i] = files[files.length-1];
					files[files.length-1] = "..";
					lastAvailable = false;
				} else {
					files[i] = files[files.length-2];
					files[files.length-2] = "..";
				}
				i--;
			}
		}
		return files;
	}
}
