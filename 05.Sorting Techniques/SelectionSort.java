import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 8, 7, 5, 2, 4};
        System.out.println("Before Sorting: " + Arrays.toString(a));
        selectionsorting(a, a.length);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }

    private static void selectionsorting(int[] a, int length) {
        int i,j,min,temp;
        for(i=0;i<length-1;i++){
            min=i;
            for(j=i+1;j<length;j++){
                   if(a[j]<a[min]){
                       min=j;
                   }
            }
            //swap
            
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
