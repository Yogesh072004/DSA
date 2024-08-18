import java.util.Scanner;

public class Product_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        System.out.println(Demo5.product(a, b));
        sc.close();
    }
}

class Demo5{
    static int product(int a,int b){
        if(a<b) return product(b, a);
        else if(b!=0) return a+product(a, b-1);
        else return 0;

    }
}