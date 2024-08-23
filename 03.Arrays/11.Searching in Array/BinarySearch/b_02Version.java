//using recursion
package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class b_02Version {
       static int BinarySearch(int a[],int l,int h,int element){
              if(l<=h) {
                int mid=(l+h)/2;
                if (a[mid]==element) {
                    return mid;
                }else if(a[mid]<element){
                    return BinarySearch(a, mid+1, h, element);
                }else{
                    return BinarySearch(a, l, mid-1, element);
                }
            }
            return -1;


       }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array siz:");
            int n=sc.nextInt();
            int i,a[]=new int[n];
            System.out.println("Enter Arary Elements");
            for(i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }
            System.out.println("Array Elements:"+Arrays.toString(a));
            System.out.println("Enter Element to search:");
            int element=sc.nextInt();
            System.out.println("Position of element:"+BinarySearch(a, 0,n-1, element));
            
        }
    }
    
}

