import java.util.Scanner;

public class MinAndMAX {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size:");
            int n=sc.nextInt();
            int max,min,i,a[]=new int[n];
            System.out.println("Enter "+n+" elements:");
            for(i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            max=a[0];
            min=a[0];
            for(i=1;i<a.length;i++){
                if(max<a[i]){
                    max=a[i];
                }else if(min>a[i]){
                    min=a[i];
                }
            }
            System.out.println("Max element is :"+max);
            System.out.println("Min element is :"+min);
        }
        
    }
}
