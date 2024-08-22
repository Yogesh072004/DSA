import java.util.Arrays;
import java.util.Scanner;

public class Version02 {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size:");
            int n=sc.nextInt();
            int[] a=new int[n];
            int i;
            System.out.println("Enter "+n+" elements:");
            for(i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Array Elements before sorting:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            Arrays.sort(a); //in ascending order
            System.out.println();
            System.out.println("Array Elements After sorting:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

           
        }
        
    
   } 

}
