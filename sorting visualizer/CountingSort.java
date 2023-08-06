import java.util.Arrays;

public class CountingSort {
    
    private int[] array;
    private int n;
    private int array_index, compare_index;
    
    public CountingSort(int[] array) {
        this.array = array;
    }
    
    public void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
      
    // Sorts arr[l..h] using iterative QuickSort
    public int[] sortOnlyOneItem() {
        n = array.length;
        int output[] = new int[n+1];
            

        // Counting sort in Java programming
        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < n; i++) {
        if (array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
        return output;
    }

      public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayIndex() {
        return array_index;
    }

    public void setArrayIndex(int array_index) {
        this.array_index = array_index;
    }

    public int getCompareIndex() {
        return compare_index;
    }

    public void setCompareIndex(int compare_index) {
        this.compare_index = compare_index;
    }
}
