package wen.example.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if(arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left == right) return;
        int mid = left + ((right - left) >> 1);
        //右移一位时除于2，右移 n 位相当于除于 2 的 n 次方
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
        //合并分开的两部分
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        //辅助数组，空间复杂度O（n）
        int index = 0;
        int p1 = left, p2 = mid + 1;
        //通过外排的方式，按照顺序放入辅助数组中
        while(p1 <= mid && p2 <= right) {
            help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid) {
            help[index++] = arr[p1++];
        }
        while(p2 <= right) {
            help[index++] = arr[p2++];
        }
        //将辅助数组中的元素复制回原素组
        for(int i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void test() {
        int[] arr = {3, 4, 7, 1, 2, 9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
