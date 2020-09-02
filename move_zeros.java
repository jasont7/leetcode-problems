public class move_zeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j=0; j < nums.length; j++) {
            if (nums[j] != 0) {
                if (nums[i] == 0)
                    swap(nums, i, j);
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
