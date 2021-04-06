package HJ9;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 * @Author BaiMohan
 * @Date 2021/4/6 21:09
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String t = str.substring(str.length() - 1);
        for (int i = str.length() - 2; i >= 0; i--) {
            if (!t.contains(str.substring(i, i + 1)))
                t += str.substring(i, i + 1);
        }
        System.out.println(t);
    }
}

