/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0316
 * @Author BaiMohan
 * @Date 2021/5/20 19:16
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public String removeDuplicateLetters(String s) {
        if(s==null||s.length()<=0){
            return null;
        }
        int[] num = new int[26];
        boolean[] exits = new boolean[26];
        // 统计各类字符的个数
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // 已经在结果集中的不用考虑了
            if(!exits[s.charAt(i)-'a']){
                // 栈顶序大于当前
                while (sb.length()>0&&sb.charAt(sb.length()-1)>s.charAt(i)){
                    // 确保弹出栈顶后后面还会出现该类单词
                    if(num[sb.charAt(sb.length()-1)-'a']>0){
                        exits[sb.charAt(sb.length()-1)-'a']=false;
                        sb.deleteCharAt(sb.length()-1);
                    }else{
                        break;
                    }
                }
                exits[s.charAt(i)-'a']=true;
                sb.append(s.charAt(i));
            }
            num[s.charAt(i)-'a']--;
        }
        return sb.toString();
    }
}
