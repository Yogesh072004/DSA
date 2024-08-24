import java.util.Arrays;

public class UpdatingOnLocation {
    static int[] updateonloc(int a[],int loc,int element){
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        if(loc>=0&&loc<a.length) b[loc]=element;
        return b;
    }
    
    public static void main(String[] args) {
        int a[]={10,11,12,13,14,15};
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(updateonloc(a, 0, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 1, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 2, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 3, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 4, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 5, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 6, 999)));
       
       
       
       
    }
       
    }
       
    

    

