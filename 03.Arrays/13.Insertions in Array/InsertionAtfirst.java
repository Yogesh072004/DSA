import java.util.Arrays;

public class InsertionAtfirst {
    static int[]insertlast(int a[],int element){
        int i,b[]=new int [a.length+1];
        b[0]=element;
        for(i=0;i<a.length;i++){
            b[i+1]=a[i];
        }
        b[i]=element;
        return b;
    }
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(insertlast(a,60)));
    }
}
