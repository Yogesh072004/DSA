import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
    
     try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array Size:");
            int size = sc.nextInt();
            int i, a[] = new int[size];
        
            System.out.println("Enter " + size + " elements...");
            for (i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int evensum=0;
            int oddsum=0;
            for (i = 0; i < a.length; i++) {
                if(a[i]%2==0) evensum+=a[i];
                else oddsum+=a[i];
            }
            System.out.println("Sum of even elements :"+evensum);
            System.out.println("Sum of odd elements :"+oddsum);
            
           
        } 
}

}
