import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
       System.out.println(Demo1.sum(n));
        sc.close();
    }
}
class Demo1{
    static int sum(int n){
        if(n==1) return 1;
        else return n+sum(n-1);
    }
}