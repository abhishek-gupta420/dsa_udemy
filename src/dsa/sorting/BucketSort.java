package dsa.sorting;

import dsa.tree.binaryTreeUsingArray.MainBinaryTreeArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    int arr[];
    BucketSort(int[] arr) {
        this.arr = arr;
        bucketSort();
    }


// Bucket sort

    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();

        }

        for (int value : arr) {
            int bunketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue);
            buckets[bunketNumber - 1].add(value);
        }

        System.out.println("\n\n Printing buckets before sorting...");
        printBuckets(buckets);

        for (ArrayList<Integer> bucket: buckets) {
            Collections.sort(bucket);
        }

        System.out.println("\n\n Printing buckets after sorting...");
        printBuckets(buckets);

        int index = 0;

        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }

//    print buckets

    public void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket# " + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,6,9};
        BucketSort bk = new BucketSort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
