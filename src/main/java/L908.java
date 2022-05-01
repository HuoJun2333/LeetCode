/**
 * @author 学徒
 * @create 2022-04-30
 * @description
 */
public class L908 {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0];
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
