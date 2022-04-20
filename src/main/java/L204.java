/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */

/**
 * @author xiexin
 * @create 2020-03-12 11:27 下午
 */
public class L204 {

    /**
     *
     * 厄拉多塞筛法
     */
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int count=0;
        for(int i=2; i<n; i++){
            if(isPrime[i]== false){
                count++;
                for(int j=i+i; j<n; j=j+i){
                    isPrime[j]=true;
                }
            }
        }
        return count;
    }
}
