public class CountSetBits {

     public static void main(String[] args) {
        int c=0;
        int n=2;
        System.out.println();
        while(n!=0){
            if((n&1)!=0){
                c++;
                n=n>>1;
            }
            n=n>>1;
        }
        System.out.println(c);
     }
}