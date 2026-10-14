public class QuickSort {
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Last element as pivot
        int i = si-1;

        for (int j=si; j<ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot at its correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;  // pivot index
    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            int pIdx = partition(arr, si, ei);

            // Left part
            quickSort(arr, si, pIdx-1);
            // Right part
            quickSort(arr, pIdx+1, ei);
        }
    }
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
