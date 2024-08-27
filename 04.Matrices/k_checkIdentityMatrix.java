import java.util.*;;
public class k_checkIdentityMatrix {
    static boolean isIdentity(int a[][],int n,int m){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i!=j&&a[i][j]!=0) return false;
                if(i==j&&a[i][j]!=1) return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix-A Row Size:");
            int rsize1 = sc.nextInt();
            System.out.println("Enter Matrix-A column size:");
            int csize1 = sc.nextInt();
            int i,j;
            int a[][] = new int[rsize1][csize1];
        
            System.out.println("Enter Matrix-A element one by one:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
           System.out.println(isIdentity(a, rsize1, csize1));
          

            

        }

    }
}
