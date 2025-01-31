package Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class timeSortingAlgorithms {

    public static void main(String[] args) throws FileNotFoundException {
        String[] filenames = {
                "./algs-data/int10.txt",
                "./algs-data/int50.txt",
                "./algs-data/int100.txt",
                "./algs-data/int1000.txt"
        };
        int runs = 10;

        for (String fileName : filenames) {
            int[] array = readArray(fileName);
            System.out.println("----------------------------");
            System.out.println("Time taken to sort: " + fileName);

            int insertionTime = 0;
            for (int i = 0; i < runs; i++) {
                int[] tempArray = array.clone();
                long startTime = System.nanoTime();
                sortingAlgorithms.insertionSort(tempArray);
                long finishTime = System.nanoTime();
                insertionTime += finishTime - startTime;
            }
            System.out.println("Insertion sort: " +(insertionTime/runs)+ "ns");

            int selectionTime = 0;
            for (int i = 0; i < runs; i++) {
                int[] tempArray = array.clone();
                sortingAlgorithms.insertionSort(tempArray);
                long startTime = System.nanoTime();
                sortingAlgorithms.selectionSort(tempArray);
                long finishTime = System.nanoTime();
                selectionTime += finishTime - startTime;
            }
            System.out.println("Selection sort: " +(selectionTime/runs)+ "ns");
        }
    }

    public static int[] readArray(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        ArrayList<Integer> data = new ArrayList<>();
        while (sc.hasNextInt()) {
            data.add(sc.nextInt());
        }
        sc.close();
        return copyArray(data);
    }

    public static int[] copyArray(ArrayList<Integer> data) {
        int n = data.size();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = data.get(i);
        }
        return res;
    }

}
