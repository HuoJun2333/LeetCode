import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 学徒
 * @create 2022-04-27
 * @description
 */
public class L417 {
    List<List<Integer>> ans = new ArrayList<>();
    int[][] map;
    boolean[][] ocean, a, p;

    public void dfs(int i, int j) {
        if (ocean[i][j]) {
            return;
        }
        ocean[i][j] = true;
        if (a[i][j] && p[i][j]) {
            // 每个元素能到这都只有一次,没有重复解
            ans.add(Arrays.asList(i, j));
        }
        if (i + 1 < map.length && map[i][j] <= map[i + 1][j]) {
            dfs(i + 1, j);
        }
        if (i - 1 >= 0 && map[i][j] <= map[i - 1][j]) {
            dfs(i - 1, j);
        }
        if (j + 1 < map[0].length && map[i][j] <= map[i][j + 1]) {
            dfs(i, j + 1);
        }
        if (j - 1 >= 0 && map[i][j] <= map[i][j - 1]) {
            dfs(i, j - 1);
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        a = new boolean[heights.length][heights[0].length];
        p = new boolean[heights.length][heights[0].length];
        map = heights;
        ocean = a;
        for (int i = 0; i < heights.length; ++i) {
            // 第0列
            dfs(i, 0);
        }
        for (int i = 0; i < heights[0].length; ++i) {
            // 第0行
            dfs(0, i);
        }
        ocean = p;
        for (int i = 0; i < heights.length; ++i) {
            // 第n - 1列
            dfs(i, heights[0].length - 1);
        }
        for (int i = 0; i < heights[0].length; ++i) {
            // 第 m 行
            dfs(heights.length - 1, i);
        }
        return ans;
    }
}
