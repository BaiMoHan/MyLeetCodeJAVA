package JZ50;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer50 数组中重复的数字
 * @Author BaiMohan
 * @Date 2021/5/22 12:32
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int duplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) return numbers[i];
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
                i--;
            }
        }
        return -1;
    }
}
