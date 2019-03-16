package wen.example.sort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr) {
        if(arr == null || arr.length < 2) return;
        for(int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length - 1 ;
        swap(arr, 0, size);
        while(size > 0) {
            heapify(arr, 0, size--);
            swap(arr, 0, size);
        }
    }
    //构建大顶堆
    public static void heapInsert(int[] arr, int index) {
        //不断与父亲节点比较，交换
        while(arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //当将堆顶与最后一个数交换后，重建构建大顶堆
    public static void heapify(int[] arr, int index, int size) {

        int left = index * 2 + 1;

        while(left < size) {
            int largeSet = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            //选择孩子结点中较大的一个
            if(arr[index] > arr[largeSet]) {
                break;
            }
            swap(arr, index, largeSet);
            index = largeSet;
            left = index * 2 + 1;
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
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
