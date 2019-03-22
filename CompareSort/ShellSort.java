package wen.example.sort.CompareSort;

import org.junit.Test;

import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int temp = 1;
        while(temp < arr.length / 3)
            temp = temp * 3 + 1;
        while(temp >= 1) {
            for(int i = temp; i < arr.length; i++) {
                if(arr[i] < arr[i - temp]) {
                    swap(arr, i, i - temp);
                }
            }
            temp = temp / 3;
        }
        SelectSort s = new SelectSort();
        s.selectSort(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void test() {
        int[] arr = {1, 4, 6, 7, 3, 5, 6, 32, 5};
        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }


}
