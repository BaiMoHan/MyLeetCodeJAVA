import java.util.Arrays;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0179
 * @Author BaiMohan
 * @Date 2021/4/12 12:43
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public String largestNumber(int[] nums) {
        int length=nums.length;
        String[] strs=new String[length];
        for(int i=0;i<length;i++)
            strs[i]=""+nums[i];
        Arrays.sort(strs,
                (a,b)->{
            String x=""+a+b;
            String y=""+b+a;
            return y.compareTo(x);
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++)
            sb.append(strs[i]);
        String res=sb.toString();
        int k=0;
        while(k<length-1&&res.charAt(k)=='0') k++;
        return res.substring(k);
    }
}
