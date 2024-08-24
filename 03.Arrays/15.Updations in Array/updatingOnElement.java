import java.util.Arrays;

public class updatingOnElement {
    static int[] updateonloc(int a[],int key,int element){
        int i,b[]=new int[a.length];
        for( i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(i=0;i<b.length;i++) {
            if(b[i]==key){
                b[i]=element;
                break;
            }
        }
        return b;
    }
    
    public static void main(String[] args) {
        int a[]={10,11,12,13,14,15};
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(updateonloc(a, 10, 999)));
       System.out.println(Arrays.toString(updateonloc(a, 90, 999)));
      
       
       
       
       
    }
       
    }
       
    

    

