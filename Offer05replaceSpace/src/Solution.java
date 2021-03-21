/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 15:37
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = new String("we are happy");
        String s = solution.replaceSpace(str);
        System.out.println(s);
    }

    public String replaceSpace(String s) {
        if (s == null || s.length() <= 0) {
            return s;
        }
        int length = s.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        char[] array = new char[length + count * 2];
        int end = length + count * 2 - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                array[end--] = s.charAt(i);
            } else {
                array[end--] = '0';
                array[end--] = '2';
                array[end--] = '%';
            }
        }
        String str = new String(array, 0, length + count * 2);
        return str;
    }
}
