/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 注意：
 * 0 ≤ x, y < 231.
 *
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:38 下午
 */
public class L461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
    public static int hammingDistance(int x, int y) {
        int a = x ^ y;
        return hammingWeight(a);
    }
    public static int hammingWeight(int n) {
        int a = 0;
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                a++;
            }
        }
        return a;
    }
}
