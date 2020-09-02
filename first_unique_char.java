import java.util.*;

public class first_unique_char {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i=0; i < s.length(); i++) {
            if (!counter.containsKey(s.charAt(i)))
                counter.put(s.charAt(i), 1);
            else
                counter.put(s.charAt(i), counter.get(s.charAt(i)) + 1);
        }

        for (int i=0; i < s.length(); i++) {
            if (counter.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
