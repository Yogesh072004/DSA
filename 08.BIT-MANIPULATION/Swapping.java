public class Swapping {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        System.out.println("Before swapping a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Before swapping a="+a+" b="+b);


    }
}
