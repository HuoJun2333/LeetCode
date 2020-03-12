
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 10:14 下午
 */

public class L14 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String reg = strs[0];
        for (String str : strs) {
            while (!str.startsWith(reg)){
                if (reg.length() == 1) {
                    return "";
                }
                reg = reg.substring(0, reg.length()-1);
            }
        }
        return reg;
    }
}
