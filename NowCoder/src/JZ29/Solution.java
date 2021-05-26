package JZ29;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description JZ 29
 * @Author BaiMohan
 * @Date 2021/5/26 10:52
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    int[] heap;
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
