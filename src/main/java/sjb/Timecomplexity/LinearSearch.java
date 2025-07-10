package sjb.Timecomplexity;

public class LinearSearch {

    public int LinearSearch(int[] array, int element) 
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element) {
                return i; 
            }
        }
        return -1;
    }
    public int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == element) {
                return mid;
            } if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

}
