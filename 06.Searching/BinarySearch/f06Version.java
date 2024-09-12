//using predifined method
package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class f06Version {

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Array siz:");
            int n=sc.nextInt();
            int i,a[]=new int[n];
            System.out.println("Enter Arary Elements");
            for(i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Array elements after sorting:");
            for(i=0;i<n;i++) System.out.println(i+"===>"+a[i]);
            System.out.println("Enter Element to search:");
            int element=sc.nextInt();
            System.out.println("Position of element:"+Arrays.binarySearch(a,0,n, element));
            
        }
    }
}
