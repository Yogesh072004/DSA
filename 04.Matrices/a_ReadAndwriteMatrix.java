import java.util.Scanner;

public class a_ReadAndwriteMatrix {
    public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Matrix Row Size:");
            int rsize=sc.nextInt();
            System.out.println("Enter Matrix column size:");
            int csize=sc.nextInt();
            int i,j,a[][]=new int[rsize][csize];
            System.out.println("Enter Matrix Element one-by-one:");
            for(i=0;i<rsize;i++){
                for(j=0;j<csize;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("MATRIX ELEMENTS ARE:");
            for(i=0;i<rsize;i++){
                for(j=0;j<csize;j++){
                    System.out.print(a[i][j]+"["+i+","+j+"]");
                }
                System.out.println();
            }
            

        }
    }
}
