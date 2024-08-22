// n =>array size
//n=5 by user
//4 1 3 5 2
//1 2 3 4 5 then below procedure....
//1st max---->a[n-1]
//2nd max---->a[n-2]
//.
//.
//.
//nth max---->a[n-n]
import java.util.Arrays;
import java.util.Scanner;

public class FstMax2ndMaxAndNthMax {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size :");
            int n=sc.nextInt();
            int[] a=new int[n];
            int i;
            System.out.println("Enter "+n+" elements:");
            for(i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Array Elements:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            Arrays.sort(a); //in ascending order
            System.out.println();
            
           for(i=0;i<n;i++){
            System.out.println((i+1)+"st max element is :"+ a[n-(i+1)]);
           }

           
        }
        
    
   } 

}
