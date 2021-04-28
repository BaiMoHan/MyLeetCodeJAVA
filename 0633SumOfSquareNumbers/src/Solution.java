/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0633 平方数之和
 * @Author BaiMohan
 * @Date 2021/4/28 22:19
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    /**
     * @title judgeSquareSum
     * @description 枚举其中一个数，相减得到另一个数，判断另一个数字是否为平方数
     * @parameters [c]
     * @updateTime 2021/4/28 22:20
     * @return boolean
     * @throws `
     */
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int t = (int) Math.sqrt(c);
        if(c==t*t) return true;
        for(a=1; a <= c/a ;a++){
            int b = c - a * a;
            t = (int) Math.sqrt(b);
            if(b ==  t*t) return true;
        }
        return false;
    }
}
