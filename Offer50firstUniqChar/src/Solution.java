import java.util.BitSet;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 16:45
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public char firstUniqChar(String s) {
        //标准ASCII码有128个，用两个比特位来表示字符出现的次数，00为0次，01为1次，11为多次
        BitSet low=new BitSet(128);
        BitSet high=new BitSet(128);
        for (int i = 0; i < s.length(); i++) {
            if(!low.get(s.charAt(i))&&!high.get(s.charAt(i))){
                low.set(s.charAt(i));   // FF -> FT
            }else if(low.get(s.charAt(i))&&!high.get(s.charAt(i))){
                high.set(s.charAt(i)); //FT -> TT
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(low.get(s.charAt(i))&&!high.get(s.charAt(i)))
                return s.charAt(i);
        }
        return ' ';
    }
}
