/**
 * @author 学徒
 * @create 2022-04-24
 * @description
 */
public class L868 {
    public int binaryGap(int n) {
        int ans = 0;
        for (int i = 31, j = -1; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                if (j != -1) {
                    ans = Math.max(ans, j - i);
                }
                j = i;
            }
        }
        return ans;
    }
}
