package HJ5;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * @Author BaiMohan
 * @Date 2021/4/6 16:54
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            str=str.substring(2);
            int res=0;
            for(int i=0;i<str.length();i++){
                res*=16;

                switch (str.charAt(i)){
                    case 'A':
                    case 'a':res+=10;break;
                    case 'B':
                    case 'b':res+=11;break;
                    case 'C':
                    case 'c':res+=12;break;
                    case 'D':
                    case 'd':res+=13;break;
                    case 'E':
                    case 'e':res+=14;break;
                    case 'F':
                    case 'f':res+=15;break;
                    default :res+=str.charAt(i)-'0';break;
                }
            }
            System.out.println(res);
        }
    }
}
