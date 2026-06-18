package DS_and_Algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];

        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i]= i;
        }
//        int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array,target);

        if (index== -1){
            System.out.println("Element not found!");
        }else {
            System.out.println("Element found" + " "+ index);

        }
    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while (low <= high) {
            int middle = (low+ high)/2;
            int value = arr[middle];
            if (value < target){
                low= middle+1;
            }else if (value > target){
                high = middle -1;
            }else {
                return middle;
            }
        }

        return -1;
    }
}