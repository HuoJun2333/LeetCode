/**
 * @author 学徒
 * @create 2022-05-18
 * @description
 */
public class L668 {
    int n, m, k;

    public int findKthNumber(int _m, int _n, int _k) {
        n = Math.min(_m, _n);
        m = Math.max(_m, _n);
        k = _k;
        int l = 1, r = m * n;
        while (l < r) {
            int mid = l + r >> 1, cnt = getCnt(mid);
            if (cnt >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    int getCnt(int mid) {
        int a = 0, b = 0;
        for (int i = 1; i <= n; i++) {
            if (i * m < mid) {
                a += m;
            } else {
                if (mid % i == 0 && ++b >= 0) {
                    a += mid / i - 1;
                } else {
                    a += mid / i;
                }
            }
        }
        return a + b;
    }

}
