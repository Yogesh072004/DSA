import java.util.Scanner;

public class NewString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.nextLine();
        System.out.println(Demo17.newS(s,s.length()-1));
        sc.close();
    }
}

class Demo17{
    static String newS(String s,int index){
        if(index<1)  return s.substring(0,index+1);
        if(s.charAt(index-1)==s.charAt(index)) return newS(s,index-1)+"*"+s.charAt(index);
        else return newS(s, index-1)+s.charAt(index);
        
    }
}