import java.util.Arrays;

public class DeletingElementInArray {
    static int[] deleteloc(int[] a,int element){
        int i,k=0;
        int b[]=new int[a.length-1];
        for(i=0;i<a.length;i++){
            if(a[i]==element) {
                continue; 
            }
            b[k++]=a[i];
        }
        return b;
    }
    public static void main(String[] args) {
         int a[]={10,11,12,13,14,15};
        System.out.println("original array:"+Arrays.toString(a));
        System.out.println(Arrays.toString(deleteloc(a,10)));
        System.out.println(Arrays.toString(deleteloc(a,11)));
        System.out.println(Arrays.toString(deleteloc(a, 12)));
        System.out.println(Arrays.toString(deleteloc(a, 13)));
        System.out.println(Arrays.toString(deleteloc(a, 14)));
        System.out.println(Arrays.toString(deleteloc(a, 15)));
        
    }
}
