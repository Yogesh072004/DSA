public class QuickSort {
    // Main method to test the algorithm
    public static void main(String[] args) {
        int a[] = { 10, 5, 88, 2, 8, 26, 55 };
        quicksort(a, 0, a.length - 1);
        // Print the sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    // Quicksort algorithm
    private static void quicksort(int[] a, int lb, int up) {
        if (lb < up) {
            int loc = partition(a, lb, up);
            quicksort(a, lb, loc - 1);
            quicksort(a, loc + 1, up);
        }
    }

    // Partition function
    private static int partition(int[] a, int lb, int up) {
        int pivot = a[lb];
        int start = lb + 1;
        int end = up;

        while (start <= end) {
            while (  start <= end && a[start] <= pivot) {
                start++;
            }
            while (  start <= end && a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        a[lb] = a[end];
        a[end] = pivot;

        return end;
    }
}