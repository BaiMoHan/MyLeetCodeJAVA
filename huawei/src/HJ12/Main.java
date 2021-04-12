package HJ12;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 字符串反转
 * @Author BaiMohan
 * @Date 2021/4/12 18:14
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String strin=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = strin.length()-1; i >=0; i--) {
            sb.append(strin.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
