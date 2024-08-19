import java.util.Scanner;

public class Nesting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=sc.nextLine();
        System.out.println(Demo18.news(s,0,s.length()-1));
        sc.close();
    }
    
}

class Demo18{
    static boolean news(String s,int i,int j){
        if(i>j) return true;
        if(s.charAt(i)=='('&&s.charAt(j)==')') return news(s, i+1, j-1);
        else return false;
    }
}