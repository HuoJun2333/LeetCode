import java.util.HashSet;
import java.util.Set;

/**
 * @author 学徒
 * @create 2022-06-05
 * @description
 */
public class L929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder sb = new StringBuilder();
            int n = s.length(), i = 0;
            boolean ok = true;
            while (i < n) {
                char c = s.charAt(i);
                if (c == '@') {
                    break;
                }
                if (c == '.' && ++i >= 0) {
                    continue;
                }
                if (c == '+') {
                    ok = false;
                }
                if (ok) {
                    sb.append(c);
                }
                i++;
            }
            set.add(sb.append(s.substring(i)).toString());
        }
        return set.size();
    }
}
