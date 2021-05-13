package AcWing3493;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description AcWing 3493
 * @Author BaiMohan
 * @Date 2021/5/13 14:31
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            if(b[i] == 1){
                res+=a[i];
                a[i] = 0;
            }
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if(i<k){
                sum+=a[i];
            }else{
                int del = a[i-k];
                int add = a[i];
                sum =  sum + add - del;
            }
            max = Math.max(sum,max);
        }
        System.out.println(res+max);
    }
}
