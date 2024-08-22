import java.util.Scanner;

public class Q8 {
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
            System.out.println("Array Elements before update:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            
            int index,newe;
            System.out.println();
            System.out.println("Enter index value:");
            index=sc.nextInt();
            System.out.println("Enter new element");
            newe=sc.nextInt();
            if(index>=0 && index<a.length) a[index]=newe;
            System.out.println("Array Elements After update:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

           
        }
        
    
   } 

}
