package NC119;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 119
 * @Author BaiMohan
 * @Date 2021/5/23 9:41
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    int[] heap;

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input =
                {62577, -220, -8737, -22, -6, 59956, 5363, -16699, 0, -10603,
                        64, -24528, -4818, 96, 5747, 2638, -223, 37663, -390, 35778,
                        -4977, -3834, -56074, 7, -76, 601, -1712, -48874, 31, 3, -9417,
                        -33152, 775, 9396, 60947, -1919, 683, -37092, -524,
                        -8, 1458, 80, -8, 1, 7, -355, 9, 397, -30, -21019, -565, 8762,
                        -4, 531, -211, -23702, 3, 3399, -67, 64542, 39546, 52500,
                        -6263, 4, -16, -1, 861, 5134, 8, 63701, 40202, 43349,
                        -4283, -3, -22721, -6, 42754, -726, 118, 51, 539, 790,
                        -9972, 41752, 0, 31, -23957, -714, -446, 4, -61087, 84, -140,
                        6, 53, -48496, 9, -15357, 402, 5541, 4, 53936, 6, 3, 37591, 7, 30,
                        -7197, -26607, 202, 140, -4, -7410, 2031, -715, 4, -60981, 365,
                        -23620, -41, 4, -2482, -59, 5, -911, 52, 50068, 38, 61, 664, 0, -868, 8681, -8, 8, 29, 412};
        int k = 131;
        System.out.println(s.GetLeastNumbers_Solution(input, k));
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length || k == 0) return res;
        heap = new int[k];
        for (int i = 0; i < k; i++) {
            heap[i] = input[i];
        }
        buildHeap(heap, k);
//        System.out.println("length=" + input.length);
//        printArray(heap);
        for (int i = k; i < input.length; i++) {
            if (heap[0] > input[i]) {
//                printArray(heap);
                heap[0] = input[i];

                buildHeap(heap, k);
//                printArray(heap);
            }
        }
        for (int i = 0; i < k; i++) {
//            System.out.println("==========================");
//            printArray(heap);
            swap(heap, 0, k - i - 1);
//            printArray(heap);
            buildHeap(heap, k - i - 1);
//            printArray(heap);
        }
        for (int i = 0; i < k; i++) {
            res.add(heap[i]);
        }
        return res;
    }

    private void buildHeap(int[] heap, int size) {
        for (int i = size / 2 + 1; i >= 0; i--) {
            downHeap(heap, i, size);
        }
    }

    public void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("##");
    }

    private void downHeap(int[] heap, int i, int size) {
        int last = i;
        if (i * 2 + 1 < size && heap[last] < heap[i * 2 + 1]) {
            last = i * 2 + 1;
        }
        if (i * 2 + 2 < size && heap[last] < heap[i * 2 + 2]) {
            last = i * 2 + 2;
        }
        if (last != i) {
            swap(heap, last, i);
            downHeap(heap, last, size);
        }
    }

    private void swap(int[] heap, int last, int i) {
        int temp = heap[last];
        heap[last] = heap[i];
        heap[i] = temp;
    }
}
