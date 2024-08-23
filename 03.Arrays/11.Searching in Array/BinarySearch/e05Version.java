//want to search element in b/w low and high values i.e low to high
package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class e05Version {

    static int BinarySearch(int a[],int start,int end,int element){

int mid;
while (start<=end) {
    mid=(start+end)/2;
    if(a[mid]==element) return mid;
    else if(element>a[mid]) start=mid+1;
    else end=mid-1;
    
}
return -1;
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Array size:");
            int n=sc.nextInt();
            int i,a[]=new int[n];
            System.out.println("Enter Arary Elements");
            for(i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Array elements after sorting:");
            for(i=0;i<n;i++) System.out.println(i+"===>"+a[i]);
            System.out.println("Enter Element to search:");
            int element=sc.nextInt();
            System.out.println("Enter starting location:");
            int start=sc.nextInt();
            System.out.println("Enter ending location:");
            int end=sc.nextInt();
            
            System.out.println("Position of element:"+BinarySearch(a,start,end, element));
            
        }
    }
}
