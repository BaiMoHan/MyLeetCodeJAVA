package JZ12;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 剑指Offer 12 数值的整数次方
 * @Author BaiMohan
 * @Date 2021/5/22 20:13
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        double res = 1.0;
        while (exponent != 0) {
            if ((exponent & 1) == 1)
                res *= base;
            base *= base;
            exponent >>= 1;
        }
        return res;
    }
}
