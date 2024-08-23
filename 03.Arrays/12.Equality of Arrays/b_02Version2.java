import java.util.Arrays;

public class b_02Version2 {
    static boolean equals(int a[],int b[]){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={1,3,2};
        System.out.println(equals(a, b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(equals(a, b));
       
    }
}
