import java.util.HashMap;

public class majority_element {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i : nums) {
            if (!counts.containsKey(i))
                counts.put(i, 1);
            else
                counts.put(i, counts.get(i) + 1);
        }

        for (int el : counts.keySet()) {
            if (counts.get(el) > n/2)
                return el;
        }
        return -1;
    }
}
