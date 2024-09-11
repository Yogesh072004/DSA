public class MergeSort {
    public static void main(String[] args) {
        int a[]={54,6,8,35,7,68,29};
        mergesort(a,0,a.length-1);
        for(int num:a) {
            System.out.println(num+" ");
        }

    }

    private static void mergesort(int[] a, int low, int high) {
        int left=low;
        int right=high;
        int mid;
        if(left<right){
            mid=(left+right)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a,low,mid,high);

        }

    }

    private static void merge(int[] a, int left, int mid, int right) {
        
       int i,j,k;
       int b[]={};
       i=left;
       j=mid+1;
       k=right;
       while (i<=mid && j<=right) {
        if(a[i]<=a[j]){
            b[k++]=a[i++];
        }else{
            b[k++]=a[j++];
        }
       }
       while (i<=mid) {
        b[k++]=a[i++];
       }
       while ((j<=right)) {
        b[k++]=a[j++];
       }
       for(i=left;i<=right;i++){
        a[i]=b[i];
       }

    }
}
