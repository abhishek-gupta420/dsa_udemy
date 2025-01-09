package dsa.queueusingarray;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int res[] = twoSum(arr, 9);
        printArr(arr);
        printArr(res);
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static int[] twoSum(int[] nums, int target) {
        int []res = new int[nums.length];
        int j = 0;
        for (int i : nums) {
            if (target % i == 0) {
                res[j++] = i;
            }
        }

        return res;
    }
}
