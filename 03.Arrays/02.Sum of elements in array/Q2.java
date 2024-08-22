import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
    
     try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array Size:");
            int size = sc.nextInt();
            int i, a[] = new int[size];
        
            System.out.println("Enter " + size + " elements...");
            for (i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int sum=0;
            for (i = 0; i < a.length; i++) {
                sum+=a[i];
            }
            System.out.println("Sum of array elements :"+sum);
            
           
        } 
}

}
