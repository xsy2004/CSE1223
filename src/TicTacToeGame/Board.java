package TicTacToeGame;

import java.util.Arrays;

public class Board {

    private char[][] board;
    private char currentPlayer;

    /**
     * This is the constructor for the class. It initializes the board so all cells in the board are equal to '-'. The currentPlayer
     * is initialized to 'x'.
     *
     */
    public Board() {
        currentPlayer = 'x';
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                this.board[i][j] = '-';
            }
        }

    }

    /**
     * The method outputs the board in the following format. First the message "Current board" underligned is printed.
     * Then the content of the board is printed as a 3 by 3 matrix.
     */
    public void print() {
        System.out.println("Current Board");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(this.board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * The method checks if all the positions on the board have been played.
     *
     * @return true if all the cells in the board are different than '-', false otherwise.
     */
    public boolean isFull() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == '-'){
                    count++;
                }
            }
        }
        return count <= 0;
    }

    /**
     * The method checks if there is a winner.
     *
     * @return true if either a column, a row or a diagonal is filled by the same character and the character is different than '-',
     * false otherwise.
     */
    public boolean isWin() {
        boolean win = false;
        int count = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                // check up and right
                if (this.board[i + 1][j] != '-' | this.board[i][j + 1] != '-'){
                    count++;
                }
                // check left
                if (i > 1){
                    if (this.board[i - 1][j] != '-'){
                        count++;
                    }
                }
                //check down
                if (j > 1){
                    if (this.board[i][j - 1] != '-'){
                        count++;
                    }
                }
            }
        }
        return count >= 3;
    }

    /**
     * The method checks if at least one row is occupied by the same player.
     *
     * @return true if any row is filled by the same character and the character is different than '-',
     * false otherwise.
     */
    private boolean checkRows() {
        return true;
    }

    /**
     * The method checks if at least one column is occupied by the same player.
     *
     * @return true if any column is filled by the same character and the character is different than '-',
     * false otherwise.
     */
    private boolean checkColumns() {
        return true;
    }

    /**
     * The method checks if at least one diagonal is occupied by the same player.
     *
     * @return true if any diagonal is filled by the same character and the character is different than '-',
     * false otherwise.
     */
    private boolean checkDiagonals() {
        return true;
    }

    /**
     * The method changes the currentPlayer. If the currentPlayer is 'x', it changes to 'o'.
     * If the currentPlayer is 'o', it changes to 'x'.
     *
     */
    public void changePlayer() {

    }

    /**
     * The method attempts to set the cell on the position indicated by the row and column given to the currentPlayer value if
     * the cell is unoccupied (equal to '-') in which case returns true. If the position is occupied (not equal to '-') the cell
     * remains unchanged and the method returns false.
     *
     */
    public boolean setRowCol(int row, int col) {
        return true;
    }
}

