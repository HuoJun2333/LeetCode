/**
 * @author 学徒
 * @create 2022-04-21
 * @description
 */
public class L824 {
    public String toGoatLatin(String sentence) {
        int n = sentence.length();
        String last = "a";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && sentence.charAt(j) != ' ') {
                j++;
            }
            if ("aeiouAEIOU".indexOf(sentence.charAt(i)) >= 0) {
                sb.append(sentence, i, j).append("ma");
            } else {
                sb.append(sentence, i + 1, j).append(sentence.charAt(i)).append("ma");
            }
            sb.append(last);
            last += "a";
            i = j + 1;
            if (i < n) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
