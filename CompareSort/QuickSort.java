package wen.example.sort.CompareSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr) {
        if(arr == null || arr.length < 2) return;
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            swap(arr, right, left + (int)(Math.random()*(right - left + 1)));
            //随机快排实现：随机生成left-right中的下标，然后与right位置的值交换
            int[] result = partition(arr, left, right);
            //三向切分优化快排，返回等于划分right位置的值的前后下标
            quickSort(arr, left, result[0] - 1);
            quickSort(arr, result[1] + 1, right);
        }
    }

    public static int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int more = right;
        int index = left;
        while(index < more) {
            if(arr[index] < arr[right]) {
                //小于基准值，与小于区域的后一个值交换
                swap(arr, index++, ++less);
            } else if(arr[index] > arr[right]) {
                //大于基准值，与大于区域的前一个值交换
                swap(arr, index, --more);
            } else {
                //等于基准值时，继续遍历下一个数
                index++;
            }
        }
        swap(arr, more, right);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void test() {
        int[] arr = {3, 4, 7, 1, 2, 9};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
