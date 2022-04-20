/**
 * @author xiexin
 * @create 2020-04-29 9:31 上午
 * @description
 */
public class L1095 {
    public static void main(String[] args) {

    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int left = 0;
        int right = len - 1;
        int mid = left + (right - left) / 2;
        while(left <= right){
            // 若 mid 前一个元素小于 mid 元素，说明 mid 暂时处于递增区间
            if(mountainArr.get(mid - 1) < mountainArr.get(mid)){
                // 若 mid 后一个元素大于 mid 元素，确定 mid 一定处于递增区间
                if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                    left = mid + 1;
                }else{
                    // 否则 mid 元素为峰值元素
                    break;
                }
            }else{
                // 如果 mid 的前一个元素大于 mid 元素，则 mid 一定处于单调递减区间
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
            // 当 mid 指向数组首尾两个元素时，为了满足数组为山脉数组，
            //           则峰值必定出现在第 2 个或者倒数第 2 个元素
            if(mid == 0 || mid == len - 1){
                mid = mid == 0 ? 1 : len - 2;
                break;
            }
        }
        // 走到这一步已经找到了山脉数组的峰值
        if(mountainArr.get(mid) < target){
            // 若数组峰值都小于目标值，则直接返回-1
            return -1;
        }
        // 首个元素不大于 target 时，在峰值之前的递增区间内寻找 target 。 否则说明递增区间不存在 target
        if(mountainArr.get(0) <= target){
            // 左半部分递增区间内，l 指针指向0， r 指针指向峰值
            int l = 0;
            int r = mid;
            int m = l + (r - l) / 2;
            while(l <= r){
                // 递增区间内，若 中间值 小于 目标值，则往右半部分查找 目标值
                if(mountainArr.get(m) < target){
                    l = m + 1;
                    // 递增区间内，若 中间值 大于 目标值，则往左半部分查找 目标值
                }else if(mountainArr.get(m) > target){
                    r = m - 1;
                }else{
                    // 中间值 等于 目标值，直接返回
                    return m;
                }
                m = l + (r - l) / 2;
            }
        }
        // 最后一个元素不大于 target 时，在峰值之后的递减区间内寻找 target 。 否则说明递减区间不存在target
        if(mountainArr.get(len - 1) <= target){
            // 右半部分递减区间内， l 指针指向峰值， r 指针指向最后一个元素
            int l = mid;
            int r = len - 1;
            int m = l + (r - l) / 2;
            while(l <= r){
                // 递减区间内，若 中间值 小于 目标值，则往左半部分查找 目标值
                if(mountainArr.get(m) < target){
                    r = m - 1;
                    // 递减区间内，若 中间值 大于 目标值，则往右半部分查找 目标值
                }else if(mountainArr.get(m) > target){
                    l = m + 1;
                }else{
                    // 中间值 等于 目标值，直接返回
                    return m;
                }
                m = l + (r - l) / 2;
            }
        }
        // 若存在target，则在上面两个判断已经return，走到这一步说明数组不存在 target
        return -1;
    }
}

  // This is MountainArray's API interface.
 // You should not implement it, or speculate about its implementation
  interface MountainArray {
      public int get(int index);

      public int length();
  }




