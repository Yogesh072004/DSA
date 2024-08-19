import java.util.Scanner;

public class DeciBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        System.out.println(Demo10.getBinary(n));
        sc.close();

    }
}

class Demo10{
    static String getBinary(int n){
        if(n==1) return "1";
        else return getBinary(n/2)+(n%2);
    }
}