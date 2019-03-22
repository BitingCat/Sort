package wen.example.sort.NotCompareSort;

import org.junit.Test;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int e : arr) {
            if(e > max) {
                max = e;
            }
            if(e < min) {
                min = e;
            }
        }

        int[] help = new int[max + 1];

        for(int i = 0; i < arr.length; i++) {
            help[arr[i]]++;
        }

        System.out.println(Arrays.toString(help));


    }


    @Test
    public void main() {
        int[] arr = {1, 3 ,4 ,6 , 4, 3, 2, 5 ,5 ,6, 7, 4 , 3, 2};
        countingSort(arr);
    }


}
