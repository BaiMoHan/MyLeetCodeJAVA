package HJ8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 类描述：
 *
 * @ClassName Main
 * @Description
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * @Author BaiMohan
 * @Date 2021/4/6 18:56
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + v);
            } else {
                map.put(k, v);
            }
        }
        for (Integer integer : map.keySet()) {
            System.out.println(integer + " " + map.get(integer));
        }
    }

}
