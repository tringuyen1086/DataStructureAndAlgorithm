package tri.nguyen;

import java.util.Arrays;

public class SelectionSort {

    /*
       Selection Sort:          Search through an array and keep track of the minimum value during each Iteration
                                At the end of each iteration, we swap variables.

       Runtime Complexity:     Quadratic time O(n^2)
                               small data set = okay
                               large data set = BAD (should never use this)
     */

    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        System.out.println("The array before sorting: ");
        System.out.println(Arrays.toString(array));

        selectionSortA(array);
        System.out.println("The array after ascending sorting: ");
        System.out.println(Arrays.toString(array));

        selectionSortD(array);
        System.out.println("The array before descending sorting: ");
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSortA ( int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                // Ascending (Increasing) Order
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void selectionSortD ( int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                // Descending (Decreasing) Order
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }
}
