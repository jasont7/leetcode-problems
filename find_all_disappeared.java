import java.util.*;

public class find_all_disappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            int ind = Math.abs(nums[i]) - 1;
            if (nums[ind] > 0)
                nums[ind] = -nums[ind];
        }
        
        List<Integer> re = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            if (nums[i] > 0)
                re.add(i+1);
        }
        return re;
    }
}
