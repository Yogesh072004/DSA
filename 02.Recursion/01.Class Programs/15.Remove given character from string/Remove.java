import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=sc.nextLine();
        System.out.println(Demo15.remove(s,s.length()-1));
        sc.close();
    }
}

class Demo15{
    static String remove(String s,int index){
        if(index<0) return " ";
        if(s.charAt(index)=='x') return remove(s, index-1);
        else return remove(s, index-1)+s.charAt(index);
        
    }
}