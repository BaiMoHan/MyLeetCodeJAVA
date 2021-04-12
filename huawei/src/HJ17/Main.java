package HJ17;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 开发一个坐标计算工具，
 * A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * @Author BaiMohan
 * @Date 2021/4/12 19:43
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        String[] strs= sc.nextLine().split(";");
        for (String str:strs){
            if(str.length()<=1||str.length()>=4){
                continue;
            }
            if(str.length()==2){
                if(str.charAt(str.length()-1)<='9'&&str.charAt(str.length()-1)>='0'){
                    int temp=Integer.valueOf(str.substring(1));
                    switch (str.charAt(0)){
                        case 'A':x-=temp;break;
                        case 'S':y-=temp;break;
                        case 'D':x+=temp;break;
                        case 'W':y+=temp;break;
                        default:continue;
                    }
                }else{
                    continue;
                }
            }else{
                if(str.charAt(str.length()-1)<='9'&&str.charAt(str.length()-1)>='0'&&
                        str.charAt(1)<='9'&&str.charAt(1)>='0'){
                    int temp=Integer.valueOf(str.substring(1));
                    switch (str.charAt(0)){
                        case 'A':x-=temp;break;
                        case 'S':y-=temp;break;
                        case 'D':x+=temp;break;
                        case 'W':y+=temp;break;
                        default:continue;
                    }
                }else{
                    continue;
                }
            }

        }
        System.out.println(x+","+y);
    }
}
