// See Instructions:
// http://apcsa-book.ausdk12.org/apcsa/r/cur/c4/L23_2D_arrays/exercises0.html?topic=c4%2FL23_2D_arrays.topic
public class GameBoard {
    private String[][] board;
    public GameBoard(int rows, int cols){
        int x = 0;
        board = new String[rows][cols];
        for(int r = 0; r< rows; r++){
            for(int c = 0; c<cols;c++){
                board[r][c] = "e";
            }
        }
    }

    public void setCell(int player, int row, int col, String c){
        
    }

    public void print(int player){
        if(player ==0){
            for(int r = 0; r<board.length;r++){
                for(int c = 0; c<board[0].length;c++){
                    System.out.print(board[r][c]+"|");
                }
                System.out.println("");
            } 
        } else if(player == 1){
            for(int r = board.length-1;r>=0;r--){
                for(int c = board[0].length-1;c>=0;r--){
                    System.out.print(board[r][c]+"|");
                    
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        GameBoard b = new GameBoard(5,5);
        b.print(1);
    }
}