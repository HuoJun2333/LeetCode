/**
 * 给定正整数 K，你需要找出可以被 K 整除的、仅包含数字 1 的最小正整数 N。
 *
 * 返回 N 的长度。如果不存在这样的 N，就返回 -1。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：1
 * 输出：1
 * 解释：最小的答案是 N = 1，其长度为 1。
 * 示例 2：
 *
 * 输入：2
 * 输出：-1
 * 解释：不存在可被 2 整除的正整数 N 。
 * 示例 3：
 *
 * 输入：3
 * 输出：3
 * 解释：最小的答案是 N = 111，其长度为 3。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-integer-divisible-by-k
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:58 下午
 */
public class L1015 {
    public int smallestRepunitDivByK(int K) {
        if (K%2 == 0 || K%5 == 0) {
            return -1;
        }
        int i = 1;
        for(int n = 1; n % K != 0; i++) {
            n %= K;
            n = n * 10 + 1;
        }
        return i;
    }
}
