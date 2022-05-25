/**
 * @author 学徒
 * @create 2022-05-25
 * @description
 */
public class L467 {
    public int findSubstringInWraproundString(String _p) {
        char[] cs = _p.toCharArray();
        int n = cs.length, ans = 0;
        int[] max = new int[26];
        max[cs[0] - 'a']++;
        for (int i = 1, j = 1; i < n; i++) {
            int c = cs[i] - 'a', p = cs[i - 1] - 'a';
            if ((p == 25 && c == 0) || p + 1 == c) {
                j++;
            } else {
                j = 1;
            }
            max[c] = Math.max(max[c], j);
        }
        for (int i = 0; i < 26; i++) {
            ans += max[i];
        }
        return ans;
    }
}
