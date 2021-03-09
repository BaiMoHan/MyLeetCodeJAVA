/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/9 20:26
 * @Version 1.0
 */
public class Solution {
    public String removeDuplicates(String S) {
        StringBuffer stringBuffer=new StringBuffer();
        int top=-1;
        for (int i = 0; i < S.length(); i++) {
            if(top>=0&&stringBuffer.charAt(top)==S.charAt(i)){
                stringBuffer.deleteCharAt(top);
                top--;
            }else{
                stringBuffer.append(S.charAt(i));
                top++;
            }
        }
        return stringBuffer.toString();
    }
}
