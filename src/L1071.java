/**
 * @author xiexin
 * @create 2020-03-12 9:47 下午
 */
public class L1071 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}
