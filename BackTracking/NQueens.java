package BackTracking;

public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {

        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonally Left Up
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonally Right Up
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {

        // Base Case
        if (row == board.length) {
            printBoard(board);
            count++;
            return true; // Solution found
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';

                // Function call
                if (nQueens(board, row + 1)) {
                    return true; // Stop after first solution
                }

                // Backtracking step
                board[row][j] = 'x';
            }
        }

        return false; // No solution found
    }

    public static void printBoard(char board[][]) {

        System.out.println("----- Chess Board -----");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]) {

        int n = 4;

        char board[][] = new char[n][n];

        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        boolean solution = nQueens(board, 0);

        if (solution) {
            System.out.println("Solution is possible.");
        } else {
            System.out.println("Solution is not possible.");
        }

        // System.out.println("Total number of ways to solve the N Queens problem = " + count);
    }
}