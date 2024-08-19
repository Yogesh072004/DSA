import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        sc.close();
        int i;
        for(i=0;i<n;i++){
            System.out.print(Demo11.fib(i));
        }
        
    }
    

}

class Demo11{
    static int fib(int n){
        if(n==0) return 0;
        else if (n==1) return 1;
        else return (fib(n-1)+fib(n-2));
    }
}