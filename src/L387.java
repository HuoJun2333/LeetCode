/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *  
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:35 下午
 */
public class L387 {
    ?
    public static void main(String[] args) {
        System.out.println(firstUniqChar("lettlcode"));
    }
    public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {

            }
        }
        return -1;
    }
}
