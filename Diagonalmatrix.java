package Phase1;

public class Diagonalmatrix {

	static int MAX = 100;
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }
 
    
    static void printSecondaryDiagonal(int mat[][], int n)
    {
        System.out.print("Secondary Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 3;
        int a[][] = { {1,3,2},
                      {6,4,5},
                      {7,4,8} };
 
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }
}
 


