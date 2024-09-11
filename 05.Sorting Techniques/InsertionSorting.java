
import java.util.*;

public class InsertionSorting {
    public static void insertionsorting(int a[], int length) {
        int i, j, temp;
        
            for(i=1;i<length;i++){
                temp=a[i];
                j=i-1;
                while(j>=0 && a[j]>temp){
                       a[j+1]=a[j];
                       j--; 
                }
                a[j+1]=temp;
            }
    }

    public static void main(String[] args) {
        int a[] = {1, 9, 3, 8, 7, 5, 2, 4};
        System.out.println("Before Sorting: " + Arrays.toString(a));
        insertionsorting(a, a.length);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
