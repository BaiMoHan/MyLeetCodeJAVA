package HJ13;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * @Author BaiMohan
 * @Date 2021/4/12 18:19
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs=sc.nextLine().split(" ");
        int n= strs.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0 ; i--) {
            sb.append(strs[i]);
            if(i!=0)
                sb.append(" ");
        }
        System.out.print(sb.toString());
    }
}
