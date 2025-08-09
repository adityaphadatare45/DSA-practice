import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void swap(List<Integer> arr, int a, int b) {
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));
        int n = arr.size();

        System.out.println("Before QuickSort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr = quickSort(arr);

        System.out.println("After QuickSort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
