package tri.nguyen;

import java.util.Arrays;

public class MergeSort {
    /*
    Merge Sort:             Recursively divide array in 2, sort, and recombine

    Runtime Complexity:     O(n log n) = quasilinear time
                                * quicksort
                                * mergesort
                                * heapsort
                            O(n^2) = quadratic time
                                * insertion sort
                                * selection sort
                                * bubble short
                                * mergesort

Space Complexity:       O(n) = linear space
                            * Merge Sort

                        O(log n) = logarithmic space
                            * Quick Sort

                        O(1) = constant space
                            * Bubble Sort
                            * Selection Sort
                            *Insertion Sort
    */

    public static void main(String[] args) {

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        System.out.println("The array before merge sort: " + Arrays.toString(array));

        mergeSort(array);
        System.out.println("The array after merge sort: " + Arrays.toString(array));

    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
