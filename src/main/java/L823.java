/**
 * @author 学徒
 * @create 2022-05-04
 * @description
 */
public class L823 {
    public int findTheWinner(int n, int k) {
        boolean[] vis = new boolean[n + 10];
        int cnt = 0, cur = 0;
        while (cnt != n - 1) {
            for (int j = 0; j < k - 1; j++) {
                cur++;
                while (vis[cur % n]) {
                    cur++;
                }
            }
            vis[cur % n] = true;
            cnt++;
            cur++;
            while (vis[cur % n]) {
                cur++;
            }
        }
        return (cur % n) + 1;
    }
}
