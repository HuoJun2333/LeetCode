/**
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * -50000 <= nums[i] <= 50000
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-31 4:18 下午
 */
public class L912 {
    public static void main(String[] args) {

    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        //构建大顶堆
        for (int i = (n - 2) / 2; i >= 0; i--) {
            siftdown(nums, n, i);
        }
        //将堆顶元素移动到尾部，重构i长度的堆
        for (int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);
            siftdown(nums, i, 0);
        }
        return nums;
    }

    private void siftdown(int[] nums, int n, int k) {
         //如果没有孩子节点就退出
        while (2 * k + 1 < n) {
             //左孩子
            int j = 2 * k + 1;
             //如果右孩子存在且大于左孩子
            if (j + 1 < n && nums[j + 1] > nums[j]) {
                 //更新右孩子为交换的孩子
                j += 1;
            }
            if (nums[k] >= nums[j]) {
                break;
            }
            swap(nums, k, j);
            k = j;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
