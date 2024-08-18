import java.util.*;
class Demo{
    static void print(int n){
        if(n>=1){
            // System.out.println(n+" "); //Reverse order
            print(n-1);
            System.out.println(n+" ");
        }
    }
}

class Main1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        Demo.print(n);
        sc.close();
    }
}