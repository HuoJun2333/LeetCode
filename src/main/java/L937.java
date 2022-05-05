import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 学徒
 * @create 2022-05-03
 * @description
 */
public class L937 {
    class Log {
        int type, idx;
        String ori, sign, content;

        Log(String s, int _idx) {
            idx = _idx;
            int n = s.length(), i = 0;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            sign = s.substring(0, i);
            content = s.substring(i + 1);
            ori = s;
            type = Character.isDigit(content.charAt(0)) ? 1 : 0;
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        List<Log> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Log(logs[i], i));
        }
        Collections.sort(list, (a, b) -> {
            if (a.type != b.type) {
                return a.type - b.type;
            }
            if (a.type == 1) {
                return a.idx - b.idx;
            }
            return !a.content.equals(b.content) ? a.content.compareTo(b.content) : a.sign.compareTo(b.sign);
        });
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i).ori;
        }
        return ans;
    }

}
