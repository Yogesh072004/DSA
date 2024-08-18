import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println(Demo6.isprime(n, n/2));
        sc.close();


        
    }
}

class Demo6{
    static boolean isprime(int n,int i){
        if(n==1) return true;
        else if(i==1) return true;
        else if(n%i==0) return false;
        else return isprime(n, --i);
    }
}