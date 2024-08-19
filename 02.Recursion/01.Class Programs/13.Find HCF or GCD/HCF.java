import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        System.out.println(Demo13.gcd(a,b));
        sc.close();

        
    }
}

class Demo13{
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b) return gcd(a-b, b);
            else return gcd(a, b-a);
        }
        return a;
    }
}