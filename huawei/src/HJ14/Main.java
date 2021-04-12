package HJ14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 给定n个字符串，请对n个字符串按照字典序排列。
 * @Author BaiMohan
 * @Date 2021/4/12 18:26
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs=new String[n];
        for (int i = 0; i < n; i++) {
            strs[i]=sc.next();
        }
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
