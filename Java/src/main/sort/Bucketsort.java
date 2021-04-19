package main.sort;

import java.util.Collections;
import java.util.Vector;

public class Bucketsort {

    // Also known as Binsort
    // Follows this steps to sort the list:
        // Set up an array of our initially empty buckets
        // Distribute our elements into their appropriate buckets
        // Sort each bucket
        //Concatenate the sorted buckets together to recreate the full list

    // Time complexity O(n²)
    // Space complexity O (n + m)

    public static void main(String[] args) {

        float[] list = {(float)0.897, (float)0.565, (float)0.656,
                (float)0.1234, (float)0.665, (float)0.3434 };

        int n = list.length;

        bucketsort(list, n);

        for (Float number : list) {
            System.out.print(number + ", ");
        }

    }

    // Implementation code for bucket sort
    public static void bucketsort(float arr[], int n) {

        //Small verification for the creation of the empty buckets
        if (n <= 0)
            return;

        // Step 1 create the n empty buckets
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        // Step 2 Put the array containing the unordered item
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }

        // Step 3 Sort the individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Step 4 Concatenate all buckets into the array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

}