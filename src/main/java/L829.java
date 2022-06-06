/**
 * @author 学徒
 * @create 2022-06-03
 * @description
 */
public class L829 {
    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        n *= 2;
        for (int k = 1; k * k < n; k++) {
            if (n % k != 0) {
                continue;
            }
            if ((n / k - (k - 1)) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
