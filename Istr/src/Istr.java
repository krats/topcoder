import java.lang.reflect.Array;
import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Istr {

    public int count(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int N = s.length();
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(map.size(), Collections.reverseOrder());
        for(int item: map.values()) {
            queue.offer(item);
        }
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll()-1);
        }
        int ans = 0;
        while (queue.size() != 0) {
            int current = queue.poll();
            ans += current*current;
        }
        return ans;
    }
}
