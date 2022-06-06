/**
 * @author 学徒
 * @create 2022-05-27
 * @description
 */
public class M1711 {
    public int findClosest(String[] ws, String a, String b) {
        int n = ws.length, ans = n;
        for (int i = 0, p = -1, q = -1; i < n; i++) {
            String t = ws[i];
            if (t.equals(a)){
                p = i;
            }
            if (t.equals(b)) {
                q = i;
            }
            if (p != -1 && q != -1) {
                ans = Math.min(ans, Math.abs(p - q));
            }
        }
        return ans;
    }
}
