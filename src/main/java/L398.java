import java.util.*;

/**
 * @author 学徒
 * @create 2022-04-25
 * @description
 */
public class L398 {
    Random random = new Random();
    Map<Integer, List<Integer>> map = new HashMap<>();

    public L398(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get(random.nextInt(list.size()));
    }

}
