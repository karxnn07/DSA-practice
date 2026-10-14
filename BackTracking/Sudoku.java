package BackTracking;

public class Sudoku {
    public static boolean solveSudoku(int sudoku[][], int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }
        // Move to next row
        int nextRow = row;
        int nextCol = col+1;

        if (col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }
        // if cell is already filled
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }
        // try numbers 1 to 9
        for (int digit=1; digit<=9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                // place digit
                sudoku[row][col] = digit;
                // recursion
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                // backtracking
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    // check whether digits can be placed 
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // check row
        for (int j=0; j<9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // check column 
        for (int i=0; i<9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // check 3x3 grid
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for (int i=startRow; i<startRow+3; i++) {
            for (int j=startCol; j<startCol+3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    // print sudoku
    public static void printSudoku(int sudoku[][]) {
        for (int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int sudoku[][] = {
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0}
        };
        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solution is possible.");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution is not possible.");
        }
    }
}
