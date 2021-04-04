import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/4/6 22:10
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public int numRabbits(int[] answers) {
        if(answers.length == 0) return 0;

        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int x : answers){
            if(map.containsKey(x) && map.get(x) > 0)
                map.put(x,map.get(x) - 1);
            else{
                res += x + 1;
                map.put(x,x);
            }
        }
        return res;
    }
}
