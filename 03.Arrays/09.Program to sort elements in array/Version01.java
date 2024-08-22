import java.util.Scanner;

public class Version01 {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size:");
            int n=sc.nextInt();
            int[] a=new int[n];
            int i,j,t;
            System.out.println("Enter "+n+" elements:");
            for(i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Array Elements before sorting:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                     if(a[i]>a[j]){ //ascending order (for descending change > to <)
                        t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                     }
                }
            }
            System.out.println();
            System.out.println("Array Elements After sorting:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

           
        }
        
    
   } 

}
