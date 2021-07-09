import java.util.Arrays;

public class SortUtils {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 1, -4, 0, 10, 60, 4, 22, 5};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    public static void quickSort(int[] arr, int first, int last) {
        if (first < last) {
            int dividerIndex = partition(arr, first, last);
            quickSort(arr, first, dividerIndex - 1);
            quickSort(arr, dividerIndex, last);
        }

    }

    public static int partition(int[] arr, int first, int last) {
        int rightIndex = last;
        int leftIndex = first;
        int pivot = arr[first];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
