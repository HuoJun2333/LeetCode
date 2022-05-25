/**
 * @author 学徒
 * @create 2022-05-21
 * @description
 */
public class L961 {
    int[] cnts = new int[10010];

    public int repeatedNTimes(int[] nums) {
        for (int x : nums) {
            if (++cnts[x] > 1) {
                return x;
            }
        }
        return -1;
    }
}
