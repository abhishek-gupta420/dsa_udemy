package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr));

            int minimumIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                    System.out.print("Min -> Index -> " + minimumIndex);
                    System.out.println();
                }
            }

            if (minimumIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }


        }
    }
}
