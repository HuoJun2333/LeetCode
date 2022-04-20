/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:22 下午
 */
import java.util.ArrayList;
import java.util.List;

public class L125 {
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        List<Character> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char aa = s.charAt(i);
            if (aa >= 'A' && aa <= 'Z') {
                a.add((char) (aa+32));
            }
            if (aa >= 'a' && aa <= 'z') {
                a.add(aa);
            }
            if (aa >= '0' && aa <= '9') {
                a.add(aa);
            }
        }
        int n = a.size();
        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(a.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
