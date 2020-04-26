/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [7,5,6,4]
 * 输出: 5
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-04-24 10:36 上午
 * @description
 */
public class M51 {
    public static void main(String[] args) {

    }
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        return dingus(nums, 0, len-1);
    }
    public int dingus(int[] nums, int left, int right){
        if(left >= right) {
            return 0;
        }
        int mid = (right+left) >> 1;
        //记录左边的结果
        int l = dingus(nums, left, mid);
        //记录右边的结果
        int r = dingus(nums, mid+1, right);
        //左+右+当前
        return (l + r + mergers(nums, left, mid, right));

    }
    public int mergers(int[]nums, int left, int mid, int right){
        //left和right都可以取到，所以需要加1
        int[] temp = new int[right-left+1];
        int ans = 0;
        int cur1 = mid;
        int cur2 = right;
        int cur3 = right - left;
        while(cur1 >= left && cur2 >= mid+1){
            if(nums[cur1] <= nums[cur2]){
                temp[cur3--] = nums[cur2--];
            }
            else{
                temp[cur3--] = nums[cur1--];
                //比当前cur2里面的元素都大
                ans += (cur2-mid);
            }
        }
        while(cur1 >= left){
            temp[cur3--] = nums[cur1--];
        }
        while(cur2 >= mid+1){
            temp[cur3--] = nums[cur2--];
        }
        int x = 0;
        while(left <= right){
            nums[left++] = temp[x++];
        }
        return ans;
    }
}

