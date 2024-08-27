import java.util.*;;
public class l_swapingOfTwoCols {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix-A Row Size:");
            int rsize1 = sc.nextInt();
            System.out.println("Enter Matrix-A column size:");
            int csize1 = sc.nextInt();
            int i,j,n,m,t;
            int a[][] = new int[rsize1][csize1];
            System.out.println("Enter Matrix-A element one by one:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
           System.out.println("Enter m and n values:");
           m=sc.nextInt();
           n=sc.nextInt();
           System.out.println("Before Swapping:");
            for (i = 0; i < rsize1; i++) {
                
                for (j = 0; j < csize1; j++) {
                   System.out.print(a[i][j]+" ");
                }
                System.out.println();
                  
            }
        

            for (i = 0; i < csize1; i++) {
                t=a[i][m-1];
                a[i][m-1]=a[i][n-1];
                a[i][n-1]=t;
            }
             System.out.println("After Swapping:");

            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            

        }

    }
}
