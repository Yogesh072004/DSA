import java.util.Scanner;

public class NewString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.nextLine();
        System.out.println(Demo16.newS(s,s.length()-1));
        sc.close();
    }
}

class Demo16{
    static String newS(String s,int index){
        if(index<1)  return s.substring(0,index+1);
        return newS(s,index-1)+"*"+s.charAt(index);
    }
}