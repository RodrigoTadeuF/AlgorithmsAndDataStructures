package main.sort;

public class Bubblesort {

    public static void main(String[] args) {

        // The bubble main.java.sort algorithm is a sorting algorithm based
        // on looking for adjacent indexes and based on that
        // make the "light" ones float

        // The time complexity is O(n²)
        // The space complexity is O(1)

        // List to test the first algorithm implementation
        int[] listOne = {1, 4, 5, 17, 7, 9, 12};

        // List to teste the second algorithm implementation
        int[] listTwo = {1, 5, 4, 7, 13, 17, 21};

        // First Sort function call
        bubblesortOne(listOne);

        // Second Sort
        bubbleSortTwo(listTwo);

        // printing the sorted list item by item
        for(int i = 0;  i < listOne.length; i++) {
            System.out.print(listOne[i] + " ");
        }

        System.out.println();

        for(int j = 0;  j < listTwo.length; j++) {
            System.out.print(listTwo[j] + " ");
        }

    }

    // First implementation of the bubblesort algorithm
    private static int[] bubblesortOne(int[] list) {
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j <list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
        return list;
    }


    //Second implementation of the bubblesort algorithm
    private static void bubbleSortTwo(int[] ar) {
        if (ar == null) {
            return;
        }

        boolean sorted;
        do {
            sorted = true;
            for (int i = 1; i < ar.length; i++) {
                if (ar[i] < ar[i - 1]) {
                    swap(ar, i - 1, i);
                    sorted = false;
                }
            }
        } while (!sorted);
    }


    // Separating the swap functionality into other function to clearing the code
    // making also the code cleaner
    private static void swap(int[] ar, int i, int j) {
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }


}
