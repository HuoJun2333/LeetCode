/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 *
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 *
 * n = 15,
 *
 * 返回:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:36 下午
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L412 {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 ==0) && (i % 5 == 0)) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i+"");
            }
        }
        return list;
    }
    public List<String> fizzBuzzCopy(int n) {
        String[] list = new String[n];
        int count_three = 0, count_five = 0;
        for (int i = 0; i < n; i++, count_three++, count_five++) {
            String s = "";
            if (count_three != 2 && count_five != 5) s += i+1;
            if (count_three == 2) {
                s += "Fizz";
                count_three = -1;
            }
            if (count_five == 4) {
                s += "Buzz";
                count_five = -1;
            }
            list[i] = s;
        }
        return new ArrayList<String>(Arrays.asList(list));
    }

}
