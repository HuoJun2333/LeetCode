/**
 * @author 学徒
 * @create 2022-05-17
 * @description
 */
public class L953 {
    int[] ord = new int[26];

    int check(String a, String b) {
        int n = a.length(), m = b.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            int c1 = a.charAt(i) - 'a', c2 = b.charAt(j) - 'a';
            if (c1 != c2) {
                return ord[c1] - ord[c2];
            }
            i++;
            j++;
        }
        if (i < n) {
            return 1;
        }
        if (j < m) {
            return -1;
        }
        return 0;
    }

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < 26; i++) {
            ord[order.charAt(i) - 'a'] = i;
        }
        int n = words.length;
        for (int i = 1; i < n; i++) {
            if (check(words[i - 1], words[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
