import java.util.Arrays;

public class Array {
    int[] arr = {10, 20, 30, 40, 50};

    void add(int value){
        int count = arr.length;
        int[] newArr = new int[count + 1];

        for (int i = 0; i < count; i++){
            newArr[i] = arr[i];
        }

        newArr[count] = value;
        arr = newArr;
        System.out.println(Arrays.toString(newArr));
    }

    void remove(int index){
        int count = arr.length;
        int[] newArr = new int[count - 1];
        int counter = 0;

        for (int i = 0; i < count; i++){
            if (i != index) {
                newArr[counter] = arr[i];
                counter++;
            }
        }

        arr = newArr;
        System.out.println(Arrays.toString(newArr));
    }
}
