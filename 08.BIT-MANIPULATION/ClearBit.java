public class ClearBit {
    public static int clearlastbit(int n,int i){
        int bitmask=(-1)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastbit(19, 0));
       System.out.println(clearlastbit(19, 1));
       System.out.println(clearlastbit(19, 2));
       System.out.println(clearlastbit(19, 3));
       System.out.println(clearlastbit(19, 4));
    }
}
