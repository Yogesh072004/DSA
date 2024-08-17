import java.util.*;

class Logic_1{
    void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("  a value is:" +a+" and b value is :"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
         System.out.println("After Swapping");
        System.out.println("  a value is:"+a+" and b value is :"+b);
    }
}

public class Logic1
{
	public static void main(String[] args) {
	    Logic_1 l=new Logic_1();
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
