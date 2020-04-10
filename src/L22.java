import java.util.ArrayList;
import java.util.List;
/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *  
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-04-09 9:44 上午
 */
public class L22 {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = generateParenthesis(3);
        for (String nn: list) {
            System.out.println(nn);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generate(res, "", 0, 0, n);
        return res;
    }

    /**
     * count1统计“(”的个数，count2统计“)”的个数
     */
    public static void generate(List<String> res , String ans, int count1, int count2, int n){

        if(count1 > n || count2 > n) {
            return;
        }

        if(count1 == n && count2 == n) {
            res.add(ans);
        }


        if(count1 >= count2){
            String ans1 = new String(ans);
            generate(res, ans+"(", count1+1, count2, n);
            generate(res, ans1+")", count1, count2+1, n);
        }
    }

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesisCopy(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int left, int right, String curStr) {
         // 左右括号都不剩余了，递归终止
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
         // 如果左括号还剩余的话，可以拼接左括号
        if (left > 0) {
            dfs(left - 1, right, curStr + "(");
        }
         // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
        if (right > left) {
            dfs(left, right - 1, curStr + ")");
        }
    }
}
