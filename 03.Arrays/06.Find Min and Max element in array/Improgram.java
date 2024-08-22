//Program to print 1st smallest ,1st largest,2nd smallest,2nd largest and so on
import java.util.Arrays;
import java.util.Scanner;

public class Improgram {
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
            System.out.println("Array Elements :");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            Arrays.sort(a); //in ascending order {for remaining Arrays.sort(a,n/2,n)}
            System.out.println();
            int low,high;
            low=0;
            high=n-1;
            while(low<=high){
                System.out.print(a[low]+" "+a[high]+" ");
                low++;
                high--;
            }

           
        }
        
    
   } 

}
