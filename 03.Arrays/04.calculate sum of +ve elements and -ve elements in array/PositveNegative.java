import java.util.Scanner;

public class PositveNegative{
public static void main(String[] args) {
    
     try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array Size:");
            int size = sc.nextInt();
            int i, a[] = new int[size];
        
            System.out.println("Enter " + size + " elements...");
            for (i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int possum=0;
            int negsum=0;
            for (i = 0; i < a.length; i++) {
                if(a[i]>0) possum+=a[i];
                else negsum+=a[i];
            }
            System.out.println("Sum of +ve elements :"+possum);
            System.out.println("Sum of -ve elements :"+negsum);
            
           
        } 
}

}
