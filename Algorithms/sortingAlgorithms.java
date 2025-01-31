package Algorithms;

import java.util.Arrays;

public class sortingAlgorithms {

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static int[] reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) { // only change from above is arrow direction
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int chosen = array[i];
            array[i] = array[minIndex];
            array[minIndex] = chosen;
        }
        return array;
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int fact_tail(int n, int result) {
        if (n == 0 || n == 1) {
            return result;
        }
        return fact_tail(n - 1, result * n);
    }

    public static int fact_iter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib_tail(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fib_tail(n - 1, b, a + b);
    }

    public static int[] shellSort(int[] array) {
        int h = 1;
        int n = array.length - 1;
        while (h < n / 3) {
            h = h * 3 + 1;
            while (h >= 1) {
                for (int i = h; i < n; i++) {
                    for (int j = i; j >= h && array[j] < array[j - h]; j = j - h) {
                        int temp = array[j];
                        array[j] = array[j - h];
                        array[j - h] = temp;
                    }
                }
                h /= 3;
            }
        }
        return array;
    }

    // Merge sort functions as required

    public static int[] merge(int[] array, int p, int q, int r) {
        int n1 = q - p + r;
        int n2 = r - q;
        int[] left = Arrays.copyOfRange(array, p, q + 1);
        int[] right = Arrays.copyOfRange(array, q + 1, r + 1);
        return array;
    }

}