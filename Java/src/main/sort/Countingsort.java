package main.sort;

public class Countingsort {

    public static void main(String[] args) {

        // Counting sort is a sorting technique based on keys between a specific range
        // It works by counting the number of objects having distinct key values
        // Then doing some arithmetic to calculate the position of each object in the output sequence.

        // Time complexity O(n + m)
        // Space complexity O(n + m)

        int[] listOne = {1, 9, 1, 3, 4, 7, 6, 7};
        int[] listTwo = {1, 3, 2, 1, 1, 5, 3, 2, 5, 4, 2, 1, 2, 1, 1, 2, 1, 4, 5, 2, 2, 3, 2};

        sort(listOne);
        sort(listTwo);

        for (int i = 0; i < listOne.length; i++) {
            System.out.print(listOne[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < listTwo.length; i++) {
            System.out.print(listTwo[i] + " ");
        }

    }


    // Creates the first step of the sorting algorithm that gets the maximum and
    // minimum value of the array then call the sorting algorithm
    public static void sort(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) minValue = values[i];
            if (values[i] > maxValue) maxValue = values[i];
        }
        countingSort(values, minValue, maxValue);
    }

    // Responsible to get the unsorted array and the minumum and maximum value
    // With them it creates a new array that will be the sorted one
    // On the loops it inserts the elements on the indexes that they should based on the keys
    private static void countingSort(int[] ar, int minVal, int maxVal) {
        int sz = maxVal - minVal + 1;
        int[] b = new int[sz];
        for (int i = 0; i < ar.length; i++) b[ar[i] - minVal]++;
        for (int i = 0, k = 0; i < sz; i++) {
            while (b[i]-- > 0) ar[k++] = i + minVal;
        }
    }

}
