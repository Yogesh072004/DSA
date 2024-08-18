import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        String n=sc.nextLine();
        System.out.println(Demo8.reverse(Integer.parseInt(n),n.length()));
        sc.close();

    }
    
}

class Demo8{
    static int reverse(int n,int len){
           if(n==0) return 0;
           else return ( (n%10)*(int)Math.pow(10, len-1))+reverse(n/10, --len);
    }
}