import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int a[],int n,int element){
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]==element) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array size");
            int n=sc.nextInt();
            int i,a[]=new int[n];
            System.out.println("Enter Arary Elements");
            for(i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }
            System.out.println("Array Elements:"+Arrays.toString(a));
            System.out.println("Enter Element to search:");
            int element=sc.nextInt();
            System.out.println("Position of element:"+linearSearch(a, n, element));
            
        }
    }
    
}
