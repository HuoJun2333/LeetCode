/**
 * @author 学徒
 * @create 2022-05-09
 * @description
 */
public class L942 {
    public int[] diStringMatch(String s) {
        int n = s.length(), l = 0, r = n, idx = 0;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[idx++] = s.charAt(i) == 'I' ? l++ : r--;
        }
        ans[idx] = l;
        return ans;
    }
}
