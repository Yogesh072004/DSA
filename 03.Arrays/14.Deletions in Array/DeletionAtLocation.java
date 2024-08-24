import java.util.Arrays;
public class DeletionAtLocation {
    static int[] deleteloc(int[] a,int loc){
        int k=0, i,b[]=new int[a.length-1];
        for(i=0;i<a.length;i++){
            if(i==loc) continue;
            b[k++]=a[i];
        }
        return b;
    }
    public static void main(String[] args) {
         int a[]={10,11,12,13,14,15};
        System.out.println("original array:"+Arrays.toString(a));
        System.out.println(Arrays.toString(deleteloc(a, 0)));
        System.out.println(Arrays.toString(deleteloc(a, 1)));
        System.out.println(Arrays.toString(deleteloc(a, 2)));
        System.out.println(Arrays.toString(deleteloc(a, 3)));
        System.out.println(Arrays.toString(deleteloc(a, 4)));
        System.out.println(Arrays.toString(deleteloc(a, 5)));
        
    }
}
