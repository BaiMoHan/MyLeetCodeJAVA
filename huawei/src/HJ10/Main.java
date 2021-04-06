package HJ10;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，
 * 换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 * @Author BaiMohan
 * @Date 2021/4/6 21:11
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        int[] book = new int[128];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            book[str.charAt(i)] = 1;
        }
        int res = 0;
        for (int i = 0; i < 128; i++)
            if (book[i] == 1)
                res++;

        System.out.print(res);
    }
}
