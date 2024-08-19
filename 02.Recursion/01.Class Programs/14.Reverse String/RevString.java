import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        System.out.println(Demo14.strev(s));
        sc.close();
    }
    
}

class Demo14{
    static String strev(String s){
        if(s==null||s.length()<=1){
            return s;
        }
        return strev(s.substring(1))+s.charAt(0);
    }
}