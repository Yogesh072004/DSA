import java.util.*;

class Logic_4{
    void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("  a value is:" +a+" and b value is :"+b);
        int temp;
        a=a^b;
        b=a^b;
        a=a^b;
         System.out.println("After Swapping");
        System.out.println("  a value is:"+a+" and b value is :"+b);
    }
}

public class Logic4
{
	public static void main(String[] args) {
	    Logic_4 l=new Logic_4();
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
