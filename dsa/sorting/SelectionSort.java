package dsa.sorting;

import java.util.*;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is minimum
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with current index
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
