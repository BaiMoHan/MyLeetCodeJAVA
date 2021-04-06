package HJ4;

import java.util.*;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * @Author BaiMohan
 * @Date 2021/4/6 15:22
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine());
            int z = sb.length() % 8 == 0 ? 0 : 8 - sb.length() % 8;
            for (int i = 0; i < z; i++)
                sb.append("0");
        }
        String str = sb.toString();
        while (str.length() > 0) {
            System.out.println(str.substring(0, 8));
            str = str.substring(8);
        }
    }
}
