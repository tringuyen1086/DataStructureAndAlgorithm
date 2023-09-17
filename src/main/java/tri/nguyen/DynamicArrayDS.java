package tri.nguyen;

public class DynamicArrayDS {

        /*
        Dynamic Array:      Java = ArrayList; C++ = Vector; JavaScript = Array; Python = List
        Pros:
                            1. Random access of elements O(1)
                            2. Good locality of reference and data cache utilization
                            3. Easy to insert/delete at the end
        Cons:
                            1. Waste more memory
                            2. Shifting elements is time-consuming O(n)
                            3. Expanding/Shrinking the array is time-consuming O(n)

         */

        // initialize and set up constructors for the DynamicArrayDS class

        private int size;
        private int capacity = 10;
        private Object[] array;

        public DynamicArrayDS(){
            this.array = new Object[capacity];
        }
        public DynamicArrayDS(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
        }

        public void add(Object data){
            if (size >= capacity){
                grow();
            }
            array[size] = data;
            size++;
        }

        public void insert(int index, Object data){
            if (size >= capacity){
                grow();
            }
            //shift all items 1 spot to the right
            for (int i = size; i > index; i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
        }

        public void delete(Object data){
            for (int i = 0; i < size; i++){
                if (array[i] == data){
                    // shift all item 1 spot to the left
                    for (int j = 0; j < (size - i - 1); j++ ){
                        array[i + j] = array[i + j + 1];
                    }
                    array[size - 1] = null;
                    size--;
                    if (size <= (int) (capacity/3)){
                        shrink();
                    }
                    break;
                }
            }
        }

        public int search(Object data){
            for (int i = 0; i < size; i++){
                if (array[i] == data){
                    return i;
                }
            }
            return -1;
        }

        private void grow(){
            int newCapacity = (int)(capacity * 2);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }

        private void shrink(){
            int newCapacity = (int)(capacity / 2);
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public String toString(){
            String string = "";
            /*
            *** use i < size instead of i < capacity if don't want to show null in the dynamic array
            for (int i = 0; i < size; i++){
                string += array[i] + ", ";
            }
             */
            for (int i = 0; i < capacity; i++){
                string += array[i] + ", ";
            }
            if (string != "") {
                // delete the last 2 character of , and space
                string = "[" +string.substring(0, string.length() - 2) + "]";
            }
            else {
                string = "[]";
            }
            return string;
        }

    public static void main(String[] args) {
        DynamicArrayDS dynamicArray = new DynamicArrayDS(5);
        System.out.println("The initializing capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        // add items using the defined class, dynamically increasing the capacity (*2) after exceeding the current size
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        System.out.println(dynamicArray);
        System.out.println("The current size: " + dynamicArray.size);
        System.out.println("After increasing more than the initializing capacity, the new grow capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        // delete item to check for the dynamic shrink (1/3)
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println(dynamicArray);
        System.out.println("The current size: " + dynamicArray.size);
        System.out.println("As the size is less than 1/3 of the previous capacity, the new shrink capacity: " + dynamicArray.capacity);

        dynamicArray.insert(0, "X");
        System.out.println("After inserting, the dynamic array: " + dynamicArray);
        dynamicArray.delete("A");
        System.out.println("After deleting, the dynamic array: " + dynamicArray);
        System.out.println("Searching for \"C\" in the dynamic array: " + dynamicArray.search("C"));
    }
}
