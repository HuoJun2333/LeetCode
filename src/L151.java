import java.util.*;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 *
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 *
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *  
 *
 * 说明：
 *
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *  
 *
 * 进阶：
 *
 * 请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-04-10 12:14 下午
 */
public class L151 {
    public static void main(String[] args) {
        String test = "";
//        System.out.println(reverseWords(test));
//        System.out.println(copy(test));
        System.out.println(hhh(test));
    }
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] ss = s.trim().split(" +");
        for(int i = ss.length-1; i >= 0; i--){
            if(!ss[i].equals("")){
                stringBuilder.append(ss[i]);
                if (i != 0){
                    stringBuilder.append(" ");
                }
            }
        }
        String res = stringBuilder.toString();
        return res;
    }

    public static String copy(String s){
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public String reverseWordsCopy(String s) {
        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        Deque<String> d = new ArrayDeque();
        Stack<String> hh = new Stack<>();
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {
                // 将单词 push 到队列的头部
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }

    public static String hhh(String s){
        //删除前后空格
        s = s.trim();
        //如果为空直接返回
        if (s.equals("")){
            return s;
        }
        //按照空格划分
        String[] str = s.split(" ");
        int n = str.length;
        StringBuilder result = new StringBuilder();
        //从后往前遍历数组，
        for (int i = n - 1;i >= 0;i--){
            //防止出现多个空格
            if (str[i].length() != 0) {
                result.append(str[i]).append(" ");
            }
        }
        //删除结尾多余空格
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

}
