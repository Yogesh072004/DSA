public class GetBit {
    public static void main(String[] args) {
        int bitmask=1<<2;
        System.out.println();
        if((4&bitmask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
