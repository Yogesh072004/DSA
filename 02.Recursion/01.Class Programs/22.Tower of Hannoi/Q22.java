import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of discs:");
        int n=sc.nextInt();
        TowerOfHanoi(n,"S","H","D");
        sc.close();

    }
    public static void TowerOfHanoi(int n,String src,String helper,String dset){
        if(n==1) {System.out.println("Move The Disk "+n+" from "+ src+ "to "+dset); return;}
        TowerOfHanoi(n-1,src,dset,helper);
        System.out.println("Move The Disk "+n+" from "+ src+ "to "+dset);
        TowerOfHanoi(n-1,helper,src,dset);

    }
}
