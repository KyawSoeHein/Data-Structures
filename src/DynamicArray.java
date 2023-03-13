public class DynamicArray {
    private int capacity = 2;
    private int size = 0;
    private int[] arr = createNewArray(capacity);

    private int[] createNewArray(int capacity){
        return arr = new int[capacity];
    }

    public void get(int index){
        if (index >= 0 && index < size){
            System.out.println("Getting value " + arr[index]);
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void set(int index, int value){
        if (index >= 0 && index < size){
            arr[index] = value;
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void pushBack(int value){
        if (size == capacity){
            capacity = capacity * 2;

            int[] temp = arr;
            createNewArray(capacity);
            for (int i = 0; i < size; i++){
                arr[i] = temp[i];
            }
            pushBack(value);
        } else {
            System.out.println("Pushing Back");
            size++;
            set(size - 1, value);
        }
    }

    public void remove(int index){
        if (index >= 0 && index < size){
            int[] temp = arr;
            int count = 0;
            capacity = capacity - 1;
            createNewArray(capacity);
            for (int i = 0; i < size; i++){
                if (i != index){
                    arr[count] = temp[i];
                    count++;
                }
            }
            size--;
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void size(){
        System.out.println("Size is: " + size);
    }

    public void printList(){
        System.out.println();
        System.out.println("Capacity is " + capacity);
        System.out.println("Size is " + size);
        System.out.print("List is ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
