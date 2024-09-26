public class LowerToUpper {

    public static String convert(String s){
        String ss="";
        for(int i=0;i<s.length();i++){
            ss=ss+(char)(s.charAt(i)^32);
        }
        return ss;

    }
    public static void main(String[] args) {
        System.out.println();
       System.out.println(convert("abc"));
    }
}
