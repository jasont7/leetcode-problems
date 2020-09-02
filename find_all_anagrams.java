import java.util.*;

public class find_all_anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> iList = new ArrayList<>();
        int pLen = p.length();
        for (int i=0; i < s.length(); i++) {
            if (i + pLen > s.length())
                break;

            if (isAnagram(s.substring(i, i+pLen), p))
                iList.add(i);
        }
        return iList;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] counter = new int[26];
        for (int i=0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
