import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println(Demo9.count(n));
        sc.close();
    }
}
 class Demo9{
    static int c=0;
    static int count(int n){
        if(n!=0) {
            c++;
            count(n/10);
        }
        return (c!=0)?c:1;
    }
 }