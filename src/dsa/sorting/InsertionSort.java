package dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > tmp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,6,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
