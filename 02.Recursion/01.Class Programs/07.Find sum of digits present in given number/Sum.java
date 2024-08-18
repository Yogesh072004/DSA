import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println(Demo7.sum(n));
        sc.close();

    }
}

class Demo7{
    static int sum(int n){
        if(n==0) return 0;
        else return(n%10)+sum(n/10);

    }
} 