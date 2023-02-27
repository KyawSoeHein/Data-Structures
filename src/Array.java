import java.util.Arrays;

public class Array {
    int count = 5;
    int[] arr = {10, 20, 30, 40, 50};

    void add(int value){
        count++;
        int[] newArr = new int[count];

        for (int i = 0; i < count - 1; i++){
            newArr[i] = arr[i];
        }
        newArr[count - 1] = value;

        System.out.println(Arrays.toString(newArr));
    }

    void remove(int index){
        int[] newArr = new int[count - 1];

        for (int i = 0; i < count - 1; i++){
            if (i != index)
                newArr[i] = arr[i];
        }
        count--;

        System.out.println(Arrays.toString(newArr));
    }
}
