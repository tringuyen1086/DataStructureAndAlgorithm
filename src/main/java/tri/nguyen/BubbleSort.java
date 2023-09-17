package tri.nguyen;

import java.util.Arrays;

public class BubbleSort {

    /*
   Bubble Search:           pairs of adjacent elements are compared, and the elements swapped if they are not in order.

   Runtime Complexity:     Quadratic time O(n^2)
                           small data set = okay-ish
                           large data set = BAD (should never use this)

    */

    public static void main(String[] args) {

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSortA(array);
        System.out.println("The array in ascending order: ");
        System.out.println(Arrays.toString(array));
        /* using the following loop to show all element with spaces between
        for (int i : array) {
            System.out.print(i + " ");
        }
         */

        bubbleSortD(array);
        System.out.println("\nThe array in descending order: ");
        System.out.println(Arrays.toString(array));
        /* using the following loop to show all element with spaces between
        for (int i : array) {
            System.out.print(i + " ");
        }
         */
    }

    public static void bubbleSortA(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                /*
                 increasing order
                    1. if the current element > the next element
                        --> create a temp and assign the current element (greater value) to the temp
                    2. assign the next value (smaller value) to the current element
                    3. the next value now is the greater value of the pair --> assign it to the temp
                    4. the loop continue until all element are sorted in acceding order

                 */
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortD ( int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
            /*
             decreasing order
                1. if the current element < the next element
                    --> create a temp and assign the current element (smaller value) to the temp
                2. assign the next value (greater value) to the current element
                3. the next value now is the smaller value of the pair --> assign it to the temp
                4. the loop continue until all element are sorted in descending order

             */
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
