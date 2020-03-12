/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:27 下午
 */
import java.util.ArrayList;

public class L204 {
    (
    //报错表示未成功
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        if (n == 2) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < n+1; i++) {
            list.add(i);
        }
        int nn = list.size();
        for (int i = 0; i < nn; i++) {
            for (int j = i+1; j < nn; j++) {
                if ((list.get(j) % list.get(i)) == 0) {
                    list.remove(j);
                    nn --;
                }
            }
        }
        return list.size();
    }
}
