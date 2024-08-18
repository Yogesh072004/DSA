import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        a=sc.nextInt();
        System.out.println("Enter b value:");
        b=sc.nextInt();
        System.out.println(Demo3.power(a, b));
        sc.close();
    }
}

class Demo3{
    static int  power(int a,int b){
        if (b>=1) return a*power(a, b-1);
        else return 1;

    }
}