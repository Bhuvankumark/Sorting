package sjb.Timecomplexity;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 15, 5};

        SelectionSort s = new SelectionSort();
        s.SelectionSort(arr); 

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
