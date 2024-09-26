public class POwof2 {

    public static boolean power(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i+"\t"+power(i));
        }
    }
}
