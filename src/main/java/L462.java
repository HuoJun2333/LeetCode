import java.util.Arrays;

/**
 * @author 学徒
 * @create 2022-05-19
 * @description
 */
public class L462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, t = nums[(n - 1) / 2], ans = 0;
        for (int i : nums) {
            ans += Math.abs(t - i);
        }
        return ans;
    }
}
