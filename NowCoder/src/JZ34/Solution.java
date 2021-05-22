package JZ34;

import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer34 第一个只出现一次的字符
 * @Author BaiMohan
 * @Date 2021/5/22 12:46
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(hashMap.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
