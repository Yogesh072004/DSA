import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        System.out.println(Demo20.replace(s,s.length()-1));
        sc.close();
    }
}
class Demo20{
    static String replace(String s,int index){
        if(index<0) return "";
        if(s.charAt(index)=='x') return replace(s, index-1)+"y";
        else return replace(s, index-1)+s.charAt(index);
    }
}