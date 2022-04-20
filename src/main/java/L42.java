/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 *
 *
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 *
 * 示例:
 *
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/trapping-rain-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-04-04 10:30 下午
 */
public class L42 {
    public static void main(String[] args) {
        int[] test = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(test));
    }
    public static int trap(int[] height){
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int max_left = 0, max_right = 0;
             //Search the left part for max bar size
            for (int j = i; j >= 0; j--) {
                max_left = Integer.max(max_left, height[j]);
            }
             //Search the right part for max bar size
            for (int j = i; j < size; j++) {
                max_right = Integer.max(max_right, height[j]);
            }
            ans += Integer.min(max_left, max_right) - height[i];
        }
        return ans;
    }
}
