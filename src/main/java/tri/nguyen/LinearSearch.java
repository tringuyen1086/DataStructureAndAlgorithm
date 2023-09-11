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

    public static int linearSearch(String[] data, String value){
        for (int position = 0; position < data.length; position++){
            if (data[position].equalsIgnoreCase(value)){
                return position;
            }
        }
        return -1;
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
        Scanner input = new Scanner(System.in);

        String[] list = {"Apple", "Pi", "Zebra", "Zoo", "Magic"};
        String value = "";

        int[] data = {1, 5, 10, 12, 18, 22, 26, 28, 30, 37};

        int target = 0;

        // prompt loop for string searching
        do {
            System.out.print("Enter a string to search (not case sensitive) or Enter to exit: ");
            value = input.nextLine();
            value = value.toUpperCase();

            // conditional statement for string searching
            if (!value.equals("")) {
                int fountAtS = linearSearch(list, value);
                System.out.printf("%s found at index %d\n", value, fountAtS);
            }
        } while (!value.equals(""));

        // prompt loop for number searching
        do {
            System.out.print("Enter a number to search or 0 to exit: ");
            target = input.nextInt();
            if (target != 0){
                int foundAtN = linearSearch(data, target);
                System.out.printf("%d found at index %d \n", target, foundAtN);
            }
        } while (target != 0);
    }
}


