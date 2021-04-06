package HJ6;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 * @Author BaiMohan
 * @Date 2021/4/6 17:16
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long n=sc.nextLong();
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0&&n!=1){
                    n/=i;
                    System.out.print(i+" ");
                }
            }
            if(n!=1)
                System.out.print(n+" ");
        }

    }
}
