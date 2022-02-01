public class MultidimanationalArrayLoop {

    public static void main(String[] args) {
        for (int row = 0; row < board.length; row++) { for (int col = 0; col < board[row].length; col++) 
        { board[row][col] = row * col; System.out.print(board[row][col] + "\t"); } System.out.println(); }

        Read more: https://javarevisited.blogspot.com/2015/09/how-to-loop-two-dimensional-array-in-java.html#ixzz7JApms5ni
    }
}
