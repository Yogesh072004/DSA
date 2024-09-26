public class ClearithBit {
    public static int clearbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
        
    }
    public static void main(String[] args) {
       System.out.println();
       System.out.println(clearbit(19, 0));
       System.out.println(clearbit(19, 1));
       System.out.println(clearbit(19, 2));
       System.out.println(clearbit(19, 3));
       System.out.println(clearbit(19, 4));

    }

}
