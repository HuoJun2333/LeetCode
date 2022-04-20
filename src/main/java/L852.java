/**
 * @author 学徒
 * @create 2022-03-04
 * @description
 */
public class L852 {
    public static void main(String[] args) {
        int[] arrays = {0,1,0};
        System.out.println(peak(arrays));
    }

    private static int peak(int[] arrays) {
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > arrays[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
