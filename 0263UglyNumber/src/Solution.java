/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0263
 * @Author BaiMohan
 * @Date 2021/4/10 22:09
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        while (n%2==0){
            n/=2;
        }
        while (n%3==0){
            n/=3;
        }
        while (n%5==0){
            n/=5;
        }
        return n==1;
    }
}
