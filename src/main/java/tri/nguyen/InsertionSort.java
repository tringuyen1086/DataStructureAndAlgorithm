package tri.nguyen;

import java.util.Arrays;

public class InsertionSort {

    /*
   Insertion Sort:          After comparing elements to the left,
                            --> shift elements to the right to make room to insert a value

   Runtime Complexity:     Quadratic time O(n^2)
                           small data set = decent
                           large data set = BAD (should never use this)

                           Less Steps than Bubble Sort
                           Best case is O(n) compared to Selection Sort O(n^2)
    */

    public static void main(String[] args) {

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        System.out.println("The array before sorting: ");
        System.out.println(Arrays.toString(array));

        insertionSortA(array);
        System.out.println("The array after ascending sorting: ");
        System.out.println(Arrays.toString(array));


        insertionSortD(array);
        System.out.println("The array after descending sorting: ");
        System.out.println(Arrays.toString(array));

        }

    private static void insertionSortA(int[] array) {

        // start with index 1 to shift elements to the right to make rom to insert a value
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j]; // shift elements to the right if array[j] > temp
                j--;
            }
            array[j + 1] = temp;
        }
    }

    private static void insertionSortD(int[] array) {
        // start with index 1 to shift elements to the right to make rom to insert a value
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < temp){
                array[j + 1] = array[j]; // shift elements to the right if array[j] > temp
                j--;
            }
            array[j + 1] = temp;
        }

    }
}
