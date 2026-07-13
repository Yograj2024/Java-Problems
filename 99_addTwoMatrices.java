import java.util.Scanner; // Scanner class import kiya user input lene ke liye

public class 99_addTwoMatrices {
    public static void main(String[] args) {

        // Scanner object create kiya jo keyboard se input padhega
        Scanner sc = new Scanner(System.in);

        // User se number of rows and column input li
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Teen 2D arrays banaye: matrixA, matrixB, aur result store karne ke liye
        // Inka size rows x cols hoga, jo user ne diya
        int matrixA [][] = new int[rows][cols];
        int matrixB [][] = new int[rows][cols];
        int result  [][] = new int[rows][cols];

        // ---- Matrix A ke elements input  ----
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {          // Outer loop -> row ke liye
            for (int j = 0; j < cols; j++) {      // Inner loop -> column ke liye
                matrixA[i][j] = sc.nextInt();     // Har position [i][j] par value input
            }
        }

        // ---- Matrix B ke elements input  ----
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {         
            for (int j = 0; j < cols; j++) {     
                matrixB[i][j] = sc.nextInt();    
            }
        }

        // ---- Dono matrix ko add karna ----
        for (int i = 0; i < rows; i++) {                      // Har row ke liye
            for (int j = 0; j < cols; j++) {                  // Har column ke liye
                result[i][j] = matrixA[i][j] + matrixB[i][j]; // Corresponding elements add kiye
            }
        }

        // ---- Result print karna ----
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {              // Row-wise print
            for (int j = 0; j < cols; j++) {          // Column-wise print
                System.out.print(result[i][j] + " "); // Element print, space ke saath
            }
            System.out.println(); // Ek row complete hone ke baad next line par jao
        }

        // Scanner object close kiya - resources free karne ke liye
        sc.close();
    }
}