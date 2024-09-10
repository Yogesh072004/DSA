import java.util.*;

public class BubbleSorting {
    public static void bubblesorting(int a[], int length) {
        int i, j, temp;
        boolean swapped;
        
        for (i = 0; i < length - 1; i++) {
            swapped = false;
            
            for (j = 0; j < length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    
                    // Indicate that a swap has occurred
                    swapped = true;
                }
            }
            
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 9, 3, 8, 7, 5, 2, 4};
        System.out.println("Before Sorting: " + Arrays.toString(a));
        bubblesorting(a, a.length);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
