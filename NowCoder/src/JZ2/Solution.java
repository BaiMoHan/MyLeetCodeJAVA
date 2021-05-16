package JZ2;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指offer 2
 * @Author BaiMohan
 * @Date 2021/5/16 14:57
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.replaceSpace("hello world"));
    }
    public String replaceSpace (String s) {
        if(s==null||s.length()<=0)
            return s;
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)==' ')
                cnt++;
        }
        int len = n + cnt*2;
        char[] newStr = new char[len];
        for (int i = n-1; i >= 0; i--) {
            if(s.charAt(i)==' '){
                newStr[--len] = '0';
                newStr[--len] = '2';
                newStr[--len] = '%';
            }else{
                newStr[--len] = s.charAt(i);
            }
        }
//        System.out.println(newStr);
        return new String(newStr);
    }
}
