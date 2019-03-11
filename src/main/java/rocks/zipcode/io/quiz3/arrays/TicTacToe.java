package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        String[] row1 = {" ", " ", " "};
        String[] row2 = {" ", " ", " "};
        String[] row3 = {" ", " ", " "};
        this.board = new String[][]{row1, row2, row3};
    }

    public String[] getRow(Integer value) {
        return new String[]{board[value][0], board[value][1], board[value][2]};
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return (board[rowIndex][0].equals(board[rowIndex][1])) && (board[rowIndex][0].equals(board[rowIndex][2]));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return (board[0][columnIndex].equals(board[1][columnIndex])) && (board[0][columnIndex].equals(board[2][columnIndex]));
    }

    public String getWinner() {
        String winner = null;
        winner = diagonalWinner();
        if(winner != null){
            return winner;
        }
        winner = rowWinner();
        if(winner != null){
            return winner;
        }
        winner = columnWinner();
        return winner;
    }

    private String columnWinner() {
        String winner = null;
        if (isColumnHomogeneous(0)){
            winner = board[0][0];
        }
        else if (isColumnHomogeneous(1)){
            winner = board[0][1];
        }
        else if (isColumnHomogeneous(2)){
            winner = board[0][2];
        }
        return winner;
    }

    private String rowWinner() {
        String winner = null;
        if (isRowHomogenous(0)){
            winner = board[0][0];
        }
        else if (isRowHomogenous(1)){
            winner = board[1][0];
        }
        else if (isRowHomogenous(2)){
            winner = board[2][0];
        }
        return winner;
    }

    private String diagonalWinner() {
        String winner = null;
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
            winner = board[1][1];
        }
        else if (board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2])){
            winner = board[1][1];
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
