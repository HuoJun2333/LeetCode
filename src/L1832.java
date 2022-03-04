import java.util.Scanner;

/**
 * @author 学徒
 * @create 2022-03-04
 * @description
 */
public class L1832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(check(str));
        }
    }

    private static boolean check(String str) {
        int bit = 0;
        for (char c:str.toCharArray()) {
            bit |= (1 << (c - 'a'));
        }
        return bit == 0x3ffffff;
    }
}
