import java.util.*;;
public class j_TransPoseMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix-A Row Size:");
            int rsize1 = sc.nextInt();
            System.out.println("Enter Matrix-A column size:");
            int csize1 = sc.nextInt();
            int i,j;
            int a[][] = new int[rsize1][csize1];
            int b[][] = new int[rsize1][csize1];
            System.out.println("Enter Matrix-A element one by one:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
           
            for (i = 0; i < rsize1; i++) {
                
                for (j = 0; j < csize1; j++) {
                    b[i][j]=a[j][i];
                }
                  
            }
            System.out.println("orginal matrix elements:");

            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
             System.out.println("Transpose matrix elements:");

            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            

        }

    }
}
