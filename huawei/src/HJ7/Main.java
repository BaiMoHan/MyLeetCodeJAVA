package HJ7;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * @Author BaiMohan
 * @Date 2021/4/6 18:25
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float a = n - (int) n;
        if (a >= 0.5) {
            System.out.print((int) n + 1);
        } else {
            System.out.print((int) n);
        }
    }
}

