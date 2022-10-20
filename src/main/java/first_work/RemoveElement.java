package first_work; // ДЗ №1. 27. Remove Element

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == val)
                ++cnt;
            else
                nums[i - cnt] = nums[i];
        }
        return n - cnt;
    }
}
