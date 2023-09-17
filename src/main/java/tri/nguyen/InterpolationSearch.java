package tri.nguyen;

public class InterpolationSearch {

    /*
    Interpolation Search:   Improvement over binary search. It's best used for "Uniformly" Distributed Data.
                            "Guesses" where a value might be based on calculated probe results.
                                If probe is incorrect, search area is narrowed, and a new probe is calculated
                            Half of the array is eliminated during each "step"

    Runtime Complexity:     average case: O(log (log(n)) )
                            worst case: O(n) [values increase exponentially]

    */

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024} ;

        int index = interpolationSearch(array, 256);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println(("Element not found"));
        }
    }

    public static int interpolationSearch(int[] array, int value){

        int high = array.length -1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);

            if (array[probe] == value){
                return probe;
            }
            else if (array[probe] < value){
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }

        return -1;
    }



}
