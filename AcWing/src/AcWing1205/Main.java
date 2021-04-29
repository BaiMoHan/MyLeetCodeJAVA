package AcWing1205;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description AcWing 1205
 * 结论题 p,q互质，则从(p-1)*(q-1)-1之后的数都能通过p*x+q*y凑出来,p,q为正整数
 * @Author BaiMohan
 * @Date 2021/4/29 23:34
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int res = (p-1)*(q-1) -1;
        System.out.print(res);
    }
}
