package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class a_01Version {
static int BinarySearch(int a[],int n,int element){
int l=0;
int h=n-1;
int mid;
while (l<=h) {
    mid=(l+h)/2;
    if(a[mid]==element) return mid;
    else if(element>a[mid]) l=mid+1;
    else h=mid-1;
    
}
return -1;
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Array size:");
            int n=sc.nextInt();
            int i,a[]=new int[n];
            System.out.println("Enter Arary Elements");
            for(i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }
            System.out.println("Array Elements:"+Arrays.toString(a));
            System.out.println("Enter Element to search:");
            int element=sc.nextInt();
            System.out.println("Position of element:"+BinarySearch(a, n, element));
            
        }
    }
}