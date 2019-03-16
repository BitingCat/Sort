package wen.example.sort;

import org.junit.Test;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                //从当前位置往后面找，选择一个最小的数
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
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
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
