package Algorithms;
import java.util.Arrays;

public class testSortingAlgorithms {
    
    public static void main(String[] args){
        runTests();
    }

    public static void runTests(){
        int[][] testCases = {
            {},                 //empty set
            {1},                //one element
            {2,1},              //two elements
            {1,2,3,4,5,6},      //pre-ordered
            {6,5,4,3,2,1},      //reversed
            {2,5,7,9,3,4},      //random
            {1,1,1,1},          //same element
            {-2,0,1,-1,-5,6}    //negatives
        };

        int[][] expected = {
            {},
            {1},
            {1,2},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {2,3,4,5,7,9},
            {1,1,1,1},
            {-5,-2,-1,0,1,6}
        };

        boolean allPass = true;

        for (int i = 0; i < testCases.length; i++){
            int[] testCase = testCases[i];
            int[] waitingValue = expected[i];
            int[] result = sortingAlgorithms.insertionSort(testCase);

            if (!Arrays.equals(result, waitingValue)){
                allPass = false;
                System.out.println("Test case failed: " + Arrays.toString(testCases[i]));
                System.out.println("Expected: " + Arrays.toString(waitingValue));
                System.out.println("Got: " + Arrays.toString(testCase));
            }

        }
        
        if (allPass){
            System.out.println("All passed - insertion sort");
        }

        int[][] reverseExpected = {
            {},
            {1},
            {2,1},
            {6,5,4,3,2,1},
            {6,5,4,3,2,1},
            {9,7,5,4,3,2},
            {1,1,1,1},
            {6,1,0,-1,-2,-5}
        };

        boolean allpassReverse = true;

        for (int i = 0; i < testCases.length; i++){
            int[] testCase = testCases[i];
            int[] waitingValue = reverseExpected[i];
            int[] result = sortingAlgorithms.reverseInsertionSort(testCase);

            if (!Arrays.equals(result, waitingValue)){
                allPass = false;
                System.out.println("Test case failed: " + Arrays.toString(testCases[i]));
                System.out.println("Expected: " + Arrays.toString(waitingValue));
                System.out.println("Got: " + Arrays.toString(testCase));
            }

        }
        
        if (allpassReverse){
            System.out.println("All passed - Reverse insertion sort");
        }

        for (int i = 0; i < testCases.length; i++){
            int[] testCase = testCases[i];
            int[] waitingValue = expected[i];
            int[] result = sortingAlgorithms.selectionSort(testCase);

            if (!Arrays.equals(result, waitingValue)){
                allPass = false;
                System.out.println("Test case failed: " + Arrays.toString(testCases[i]));
                System.out.println("Expected: " + Arrays.toString(waitingValue));
                System.out.println("Got: " + Arrays.toString(testCase));
            }

        }
        
        if (allPass){
            System.out.println("All passed - Selection sort");
        }
        
        //Factorial functions
        if (sortingAlgorithms.fact(5) == 120){
            System.out.println("Passed - factorial");
        } else {
            System.out.println("Factorial failed");
        }

        if (sortingAlgorithms.fact_tail(5, 1) == 120){
            System.out.println("Passed - factorial tail");
        } else {
            System.out.println("Factorial tail failed");
        }

        if (sortingAlgorithms.fact_iter(5) == 120){
            System.out.println("Passed - factorial iterative");
        } else {
            System.out.println("Factorial iterative failed");
        }

        //Fibonacci

        if (sortingAlgorithms.fib(6) == 8){
            System.out.println("Passed - Fibonacci");
        } else {
            System.out.println("Fibonacci Failed");
        }
        if (sortingAlgorithms.fib_tail(6,0,1) == 8){
            System.out.println("Passed - Fibonacci");
        } else {
            System.out.println("Fibonacci Failed");
        }

        //shell sort

        for (int i = 0; i < testCases.length; i++){
            int[] testCase = testCases[i];
            int[] waitingValue = expected[i];
            int[] result = sortingAlgorithms.shellSort(testCase);

            if (!Arrays.equals(result, waitingValue)){
                allPass = false;
                System.out.println("Test case failed: " + Arrays.toString(testCases[i]));
                System.out.println("Expected: " + Arrays.toString(waitingValue));
                System.out.println("Got: " + Arrays.toString(testCase));
            }

        }
        
        if (allPass){
            System.out.println("All passed - shell sort");
        }

    }

}
