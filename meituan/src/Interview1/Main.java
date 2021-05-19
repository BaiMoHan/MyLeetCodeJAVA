package Interview1;

import java.util.*;
/**
 * 类描述：
 *
 * @ClassName Main
 * @Description 美团1面
 * @Author BaiMohan
 * @Date 2021/5/19 16:15
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        int[] num = {5,596,31,0,-85,27,10,11,3,88,77};
        bulidHeap(num,num.length);
        for(int i=0;i<3;i++){
            swap(num,0,num.length-1-i);
            bulidHeap(num,num.length-1-i);
        }
        for(int i=0;i<3;i++){
            System.out.print(num[num.length-1-i]+"    ");
        }
    }
    public static void bulidHeap(int[] num,int size){
        for(int i =size/2+1;i>=0;i--){
            down(num,i,size);
        }
    }
    public static  void down(int[] num,int i,int size){
        int last = i;
        if(i*2+1<size&&num[i*2+1]>num[last]){
            last = i*2+1;
        }
        if(i*2+2<size&&num[i*2+2]>num[last]){
            last = i*2+2;
        }
        if(last!=i){
            swap(num,i,last);
            down(num,last,size);
        }
    }
    public static void swap(int[] num,int i,int j){
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }
}
