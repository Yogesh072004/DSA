
public class a_01Version1 {

    static boolean equals(int a[],int b[]){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(equals(new int[] {1,2,3}, new int[]{1,2,3}));
        System.out.println(equals(new int[] {1,5,3}, new int[]{1,2,3}));
        System.out.println(equals(new int[] {1,2,3}, new int[]{3,2,1}));
    }
}
