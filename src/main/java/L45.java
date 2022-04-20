/**
 * @author xiexin
 * @create 2020-05-04 2:07 下午
 * @description
 */
public class L45 {
    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
