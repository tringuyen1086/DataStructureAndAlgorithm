package tri.nguyen;

import java.util.Scanner;
public class BinarySearch {
    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            int currentMid = array[mid];

            System.out.println("mid: " + currentMid);

            if (currentMid < target) low = mid + 1;
            else if (currentMid > target) high = mid - 1;
            else return mid; // target found
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        /*
            Binary Search:          Search algorithm that finds the position of a target value within a sorted array.
                                    Half of the array is eliminated during each "step"

            Runtime Complexity:     O(log n)

            Pros:
                                    1. Better than a linear search algorithm with the time complexity of O(n)
                                    2. At each iteration, the binary search algorithm eliminates half of the list
                                       and significantly reduces the search space
                                    3. Works even when the array is rotated by some position and finds the target element.
            Cons:
                                    1. The recursive method uses stack space.
                                    2. Caching is poor.
                                    3. Binary search is error-prone. Some common errors are:
                                        * Handling of duplicate items: While returning the first item,
                                          it might be possible we return a subsequence similar item.
                                        * Numerical underflows/overflows: In huge arrays when computing indices.
                                          There might be overflows
                                        * Recursive vs non-recursive implementation,
                                          which should be considered while designing as recursive takes stack space.
         */
        int[] array = new int[10000];

        // iterate to assign values from 0 to 9999 to the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // ask for the target search
        Scanner input = new Scanner(System.in);
        int target = 0;
        do {
            System.out.print("Enter a number to search or 0 to exit: ");
            target = input.nextInt();
            if (target != 0) {
                int foundAt = binarySearch(array, target);
                System.out.printf("%d found at index %d \n", target, foundAt);
            }
        } while (target != 0);
    }
}


