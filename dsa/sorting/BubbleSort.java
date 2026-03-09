package sorting;
import java.util.*;
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // Print array after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}