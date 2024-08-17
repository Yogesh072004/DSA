import java.util.*;
class Demo
{
	static String check_evenorodd(int n)
	{
//manual code
		return (n%2==0)?"EVEN NUMBER":"ODD NUMBER";
	}
}
class Main
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = obj.nextInt();
		System.out.println(Demo.check_evenorodd(n));
	}
}
