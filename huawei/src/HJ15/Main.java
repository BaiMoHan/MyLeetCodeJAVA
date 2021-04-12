package HJ15;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * @Author BaiMohan
 * @Date 2021/4/12 19:20
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        System.out.println(count);
    }
}
