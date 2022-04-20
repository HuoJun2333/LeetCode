import java.util.ArrayList;
import java.util.List;

/**
 *给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:44 下午
 */
public class L17 {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<String>();
        }
        char[][] numChar = new char[][]{
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}
        };
        List<String> result = new ArrayList<>();
        char[] tem  = new char[digits.length()];
        char[][] temp = new char[digits.length()][];
        for(int i = 0; i < digits.length(); i ++){
            temp[i] = numChar[digits.charAt(i) - '2'];
        }
        build(result, temp, tem, 0);
        return result;

    }
    private static void build(List<String> result, char[][] temp, char[] tem, int idx){
        for(char tt : temp[idx]){
            tem[idx] = tt;
            if(idx == temp.length - 1){
                result.add(new String(tem));
            }else{
                build(result, temp, tem, idx + 1);
            }
        }
    }
}
