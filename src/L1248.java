/**
 * 给你一个整数数组 nums 和一个整数 k。
 *
 * 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
 *
 * 请返回这个数组中「优美子数组」的数目。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2,1,1], k = 3
 * 输出：2
 * 解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
 * 示例 2：
 *
 * 输入：nums = [2,4,6], k = 1
 * 输出：0
 * 解释：数列中不包含任何奇数，所以不存在优美子数组。
 * 示例 3：
 *
 * 输入：nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * 输出：16
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-number-of-nice-subarrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-04-21 10:09 上午
 * @description
 */
public class L1248 {
    public static void main(String[] args) {
        System.out.println(11 & 1);
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(numberOfSubarrays(nums, 1));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++){
//            if ((nums[i] & 1) == 1){
//                nums[i] = 1;
//            } else {
//                nums[i] = 0;
//            }
//        }
        int[] v = new int[nums.length+1];
        int pre = 0;
        v[0] = 1;
        int res = 0;
        for (int x : nums) {
            pre += x & 1;
            v[pre]++;
            if(pre >= k) {
                res += v[pre-k];
            }
        }
        return res;
    }
}
