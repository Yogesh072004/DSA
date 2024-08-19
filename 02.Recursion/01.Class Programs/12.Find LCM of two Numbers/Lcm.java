import java.util.Scanner;

public class Lcm
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        System.out.println(Demo12.lcm(a,b));
        sc.close();

    }
}
class Demo12{
    static int com=1;
    static int lcm(int a,int b){
        if(com%a==0&&com%b==0) return com;
        com++;
        lcm(a,b);
        return com;
    }
}