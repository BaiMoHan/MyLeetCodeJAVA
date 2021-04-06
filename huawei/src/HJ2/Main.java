package HJ2;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 *  写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
 *  然后输出输入字符串中该字母的出现次数。不区分大小写。
 * @Author BaiMohan
 * @Date 2021/4/6 14:46
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String sub=sc.nextLine().toLowerCase();

        int res=0;
        res=str.length()-str.replace(sub,"").length();
        System.out.print(res);
    }
}
