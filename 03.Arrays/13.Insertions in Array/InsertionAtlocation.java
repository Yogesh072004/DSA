import java.util.Arrays;

public class InsertionAtlocation {
    static int[]insertlast(int a[],int element,int loc){
        int i,b[]=new int [a.length+1];
        int k=0;
        for(i=0;i<loc;i++)  b[k++]=a[i];
        b[k++]=element;
        for(i=loc;i<a.length;i++) b[k++]=a[i];
        return b;
    }
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(insertlast(a,60,4)));
    }
}
