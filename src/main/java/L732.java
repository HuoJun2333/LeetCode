import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 学徒
 * @create 2022-06-06
 * @description
 */
public class L732 {
    class MyCalendarThree {
        static int N = (int) 1e9 + 10, M = 1200010, SZ = N / M + 10;
        static int[] max = new int[M], add = new int[M];
        static Map<Integer, Integer> map = new HashMap<>();
        int minv = -1, maxv = -1;

        int getIdx(int x) {
            return x / SZ;
        }

        void add(int l, int r) {
            pushdown(l);
            pushdown(r);
            if (getIdx(l) == getIdx(r)) {
                for (int k = l; k <= r; k++) {
                    map.put(k, map.getOrDefault(k, 0) + 1);
                    max[getIdx(k)] = Math.max(max[getIdx(k)], map.get(k));
                }
            } else {
                int i = l, j = r;
                while (getIdx(i) == getIdx(l)) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                    max[getIdx(i)] = Math.max(max[getIdx(i)], map.get(i));
                    i++;
                }
                while (getIdx(j) == getIdx(r)) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                    max[getIdx(j)] = Math.max(max[getIdx(j)], map.get(j));
                    j--;
                }
                for (int k = getIdx(i); k <= getIdx(j); k++) {
                    max[k]++;
                    add[k]++;
                }
            }
        }

        int query(int l, int r) {
            pushdown(l);
            pushdown(r);
            int ans = 0;
            if (getIdx(l) == getIdx(r)) {
                for (int k = l; k <= r; k++) {
                    ans = Math.max(ans, map.getOrDefault(k, 0));
                }
            } else {
                int i = l, j = r;
                while (getIdx(i) == getIdx(l)) {
                    ans = Math.max(ans, map.getOrDefault(i++, 0));
                }
                while (getIdx(j) == getIdx(r)) {
                    ans = Math.max(ans, map.getOrDefault(j--, 0));
                }
                for (int k = getIdx(i); k <= getIdx(j); k++) {
                    ans = Math.max(ans, max[k]);
                }
            }
            return ans;
        }

        void pushdown(int x) {
            int idx = getIdx(x);
            if (add[idx] == 0) {
                return;
            }
            int i = x, j = x + 1;
            while (getIdx(i) == idx) {
                map.put(i, map.getOrDefault(i--, 0) + add[idx]);
            }
            while (getIdx(j) == idx) {
                map.put(j, map.getOrDefault(j++, 0) + add[idx]);
            }
            add[idx] = 0;
        }

        public MyCalendarThree() {
            Arrays.fill(max, 0);
            Arrays.fill(add, 0);
            map.clear();
        }

        public int book(int start, int end) {
            add(start + 1, end);
            minv = minv == -1 ? start : Math.min(minv, start);
            maxv = maxv == -1 ? end + 1 : Math.max(maxv, end + 1);
            return query(minv, maxv);
        }
    }
}
