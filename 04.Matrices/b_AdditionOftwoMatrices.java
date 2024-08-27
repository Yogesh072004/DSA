import java.util.Scanner;

public class b_AdditionOftwoMatrices {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix-A Row Size:");
            int rsize1 = sc.nextInt();
            System.out.println("Enter Matrix-A column size:");
            int csize1 = sc.nextInt();
            System.out.println("Enter Matrix-B Row Size:");
            int rsize2 = sc.nextInt();
            System.out.println("Enter Matrix-B column size:");
            int csize2 = sc.nextInt();
            if (rsize1 == rsize2 && csize1 == csize2) {
                int i, j;
                int a[][] = new int[rsize1][csize1];
                int b[][] = new int[rsize2][csize2];
                int c[][] = new int[rsize1][csize1];
                System.out.println("Enter Matrix-A Element one by one:");
                for (i = 0; i < rsize1; i++) {
                    for (j = 0; j < csize1; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter Matrix-B Element one by one:");
                for (i = 0; i < rsize2; i++) {
                    for (j = 0; j < csize2; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }
                for (i = 0; i < rsize1; i++) {
                    for (j = 0; j < csize2; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("Matrix-A Elements are:");
                for (i = 0; i < rsize1; i++) {
                    for (j = 0; j < csize1; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix-B Elements are:");
                for (i = 0; i < rsize2; i++) {
                    for (j = 0; j < csize2; j++) {
                        System.out.print(b[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix-C Elements are:");
                for (i = 0; i < rsize1; i++) {
                    for (j = 0; j < csize1; j++) {
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Matrix addition is not possible");
            }

        }

    }
}
