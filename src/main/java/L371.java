/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:54 下午
 */
public class L371 {
    public int getSum(int a, int b) {
        int c = a ^ b;
        int d = a & b;
        if(d != 0 ){
            //说明存在进位
            d<<=1;
            return getSum(c ,d);
        } else {
            return c;
        }
    }

    public int getSumCopy(int a, int b) {
        int digit = 1;
        int sum = 0;
        int carry = 0;
        while (digit != 0) {
            int a_digit = a & digit;
            int b_digit = b & digit;
            int oneDigitResult = a_digit ^ b_digit;
            sum |= oneDigitResult ^ carry;
            carry = (a_digit & b_digit) | oneDigitResult & carry;
            digit <<= 1;
            carry <<= 1;
        }
        return sum;
    }
}
