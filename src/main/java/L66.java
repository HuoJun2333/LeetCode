/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:20 下午
 */
public class L66 {
    public static void main(String[] args) {
        int[] a = {
                0
        };
        int[] b = plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"  ");
        }
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 0) {
            digits[0] += 1;
            return digits;
        }
        if(check(digits)) {
            int[] a = new int[digits.length+1];
            a[0] = 1;
            return a;
        }
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
    public static boolean check(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9) {
                return false;
            }
        }
        return true;
    }
}
