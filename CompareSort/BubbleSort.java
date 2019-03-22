package wen.example.sort.CompareSort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for(int i = arr.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    //两两对比，大的数往后面沉
                    swap(arr, j, j + 1);
                }
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
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
