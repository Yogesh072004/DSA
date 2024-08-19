import java.util.Scanner;

public class Mainnn {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=sc.nextLine();
        System.out.println(Demo19.count(s,'a',s.length()-1));
        sc.close();
      }
}

class Demo19{
    static int count(String s,char ch,int index){
        if(index<0) return 0;
        if(s.charAt(index)==ch) return 1+ count(s, ch, index-1) ;
        else return count(s, ch, index-1);
    }
}