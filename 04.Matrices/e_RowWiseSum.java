import java.util.*;
public class e_RowWiseSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix-A Row Size:");
            int rsize1 = sc.nextInt();
            System.out.println("Enter Matrix-A column size:");
            int csize1 = sc.nextInt();
            int i,j,sum;
            int a[][] = new int[rsize1][csize1];
            System.out.println("Enter Matrix-A element one by one:");
            for (i = 0; i < rsize1; i++) {
                for (j = 0; j < csize1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
           
            for (i = 0; i < rsize1; i++) {
                sum=0;
                for (j = 0; j < csize1; j++) {
                    sum=sum+a[i][j];
                }
                System.out.println((i+1)+"Row Sum="+sum);

            
                
            }
            

        }

    }
}
