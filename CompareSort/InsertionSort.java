package wen.example.sort.CompareSort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {

    public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j+ 1);
            }
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
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
