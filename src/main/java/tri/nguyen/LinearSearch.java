package tri.nguyen;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] data, int value){
        int position = 0;
        while (position < data.length && data[position] != value){
            position++;
        }
        return (position < data.length) ? position : -1;
    }
    public static void main(String[] args) {
        /*
            Linear Search:          Iterate through a collection one element at a time

            Runtime Complexity:     O(n)

            Pros:
                                    1. Fast for searches of small to medium data sets
                                    2. Does not need to be sorted
                                    3. Useful for data structures that do not have random access (Linked List)
            Cons:
                                    1. Slow for large data sets
         */
        int[] data = {1, 5, 10, 12, 18, 22, 26, 28, 30, 37};
        Scanner input = new Scanner(System.in);

        int value = 0;
        do {
            System.out.print("Enter a number to search or 0 to exit: ");
            value = input.nextInt();
            if (value != 0){
                int foundAt = linearSearch(data, value);
                System.out.printf("%d found at index %d \n", value, foundAt);
            }
        } while (value != 0);
    }

}


