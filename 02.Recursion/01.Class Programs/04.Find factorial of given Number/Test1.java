import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println(Demo4.fact(n));
        sc.close();
    }
}

class Demo4{
    static int fact (int n){
        if (n==1) return 1;
        else return n*fact(n-1);
    }
}