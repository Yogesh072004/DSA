import java.util.Scanner;

public class Version3 {
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
            int old,newe;
            System.out.println();
            System.out.println("Enter old element");
            old=sc.nextInt();
            System.out.println("Enter new element");
            newe=sc.nextInt();
            int count=0;
            for(i=0;i<a.length;i++){
                if(old==a[i]) {
                    count++;
                    if(count==2){
                        a[i]=newe;
                        break;
                    }
                }
            }
            System.out.println("Array Elements After update:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }

           
        }
        
    
   } 

}
