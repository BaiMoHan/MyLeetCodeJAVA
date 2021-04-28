package AcWing1221;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description AcWing 1221 四数之和
 * @Author BaiMohan
 * @Date 2021/4/28 22:38
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {
    // 4个数 a b c d 
    public static final int len = 5000010;
    public static int[] C = new int[len]; // c 的哈希表
    public static int[] D = new int[len]; // d 的哈希表

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(C, -1);
        Arrays.fill(D, -1);
        for (int c = 0; c * c <= n; c++) {
            for (int d = c; c * c + d * d <= n; d++) {
                int t = c * c + d * d;
                if (C[t] == -1) {
                    C[t] = c;
                    D[t] = d;
                }
            }
        }
        for (int a = 0; a * a <= n; a++) {
            for (int b = a; a * a + b * b <= n; b++) {
                int t = n - a * a - b * b;
                if (C[t] != -1) {
                    System.out.print(a + " " + b + " " + C[t] + " " + D[t]);
                    return;
                }
            }

        }
    }
}
