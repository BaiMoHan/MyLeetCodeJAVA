package NC61;

import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 61
 * @Author BaiMohan
 * @Date 2021/5/7 8:30
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if(hashMap.containsKey(temp)){
                return new int[]{hashMap.get(temp),i+1};
            }
            hashMap.put(numbers[i],i+1);
        }
        return new int[0];
    }
}
