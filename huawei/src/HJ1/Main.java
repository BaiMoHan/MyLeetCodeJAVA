package HJ1;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 计算字符串最后一个单词的长度，单词以空格隔开。
 * @Author BaiMohan
 * @Date 2021/4/6 14:33
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int res=s[s.length-1].length();
        System.out.print(res);
    }
}