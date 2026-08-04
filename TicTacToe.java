enum Cell { X, O, EMPTY }
public class TicTacToe {
    private Cell[][] board = new Cell[3][3];
    private boolean turnX = true;

    public TicTacToe() {
        for(int r=0;r<3;r++) for(int c=0;c<3;c++) board[r][c]=Cell.EMPTY;
    }

    public boolean makeMove(int r, int c) {
        if(board[r][c]!=Cell.EMPTY) return false;
        board[r][c] = turnX ? Cell.X : Cell.O;
        turnX = !turnX; return true;
    }

    public boolean isWinner(Cell p) {
        for(int i=0;i<3;i++) if(board[i][0]==p&&board[i][1]==p&&board[i][2]==p) return true;
        for(int i=0;i<3;i++) if(board[0][i]==p&&board[1][i]==p&&board[2][i]==p) return true;
        if(board[0][0]==p&&board[1][1]==p&&board[2][2]==p) return true;
        if(board[0][2]==p&&board[1][1]==p&&board[2][0]==p) return true;
        return false;
    }

    public boolean isDraw() {
        for(int r=0;r<3;r++) for(int c=0;c<3;c++) if(board[r][c]==Cell.EMPTY) return false;
        return !isWinner(Cell.X) && !isWinner(Cell.O);
    }
}