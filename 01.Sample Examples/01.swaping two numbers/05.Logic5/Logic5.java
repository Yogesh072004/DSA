import java.util.*;

class Logic_5{
    void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("  a value is:" +a+" and b value is :"+b);
        a=(a+b)-( b=a)
         System.out.println("After Swapping");
        System.out.println("  a value is:"+a+" and b value is :"+b);
    }
}

public class Logic5
{
	public static void main(String[] args) {
	    Logic_5 l=new Logic_5();
	    Scanner sc=new Scanner(System.in);
	    int a;
	    int b;
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		l.swap(a,b);
		
		
	}
}