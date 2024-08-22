import java.util.Arrays;
import java.util.Scanner;

public class Wavy {
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
            Arrays.sort(a); 
            int t;
            System.out.println();
            System.out.print(a[0]+" ");
            for(i=1;i<n-1;i=i+2){
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                System.out.print(a[i]+" "+a[i+1]+" ");
            }
        //    if(n%2==0){
        //     System.out.println(a[i]);
        //    }

           
        }
        
    
   } 

}
/*  t= 1 a[1]=3 a[2]=2
 * 1 2 3 4 5 6
 * 1 3 2 4 5 6 //1st [t= 1 a[1]=3 a[2]=2]
 * 1 3 2 5 4 6 //2nd [t= 4 a[3]=5 a[4]=4]
 *   and so on...
 * 
 */