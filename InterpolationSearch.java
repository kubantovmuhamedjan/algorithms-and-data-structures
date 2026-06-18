package DS_and_Algorithm;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9};

        int index = interpolationSearch(arr, 8);

        if (index != -1) {
            System.out.println("Element found at index "+ index);
        }else {
            System.out.println("Not found!");
        }
    }

    private static int interpolationSearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;

        while (value >= arr[low] && value <= arr[high] && low <= high){
            int probe = (high - low) * (value - arr[low]) /
                        (arr[high]- arr[low]);
            System.out.println("probe: "+ probe);
            if (arr[probe] ==value){
                return probe;
            }else if (arr[probe]< value){
                low = probe+1;
            }else {
                high = probe -1;
            }
        }
        return -1;
    }
}
