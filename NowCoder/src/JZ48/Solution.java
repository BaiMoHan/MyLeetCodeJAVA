package JZ48;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer48 不用加减乘除做加法
 * @Author BaiMohan
 * @Date 2021/5/22 17:15
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int Add(int num1, int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        return num1;
    }
}
