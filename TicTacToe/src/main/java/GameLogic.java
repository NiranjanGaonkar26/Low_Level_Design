import Model.*;

import java.util.*;

public class GameLogic {
    Deque<Player> players;
    Board gameBoard;
    Scanner sc = new Scanner(System.in);

    public void initializeGame(){
        players = new LinkedList<>();

        Piece pieceX = new PieceX();
        Player player1 = new Player("Yaak", pieceX);

        Piece pieceO = new PieceO();
        Player player2 = new Player("Ninge", pieceO);

        players.add(player1);
        players.add(player2);

        this.gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){

            Player currPlayer = players.removeFirst();
            gameBoard.printBoard();

            List<Map.Entry<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player: "+currPlayer.getPlayerName()+" Enter Row, Column: ");
            String userIp = sc.nextLine();
            String[] values = userIp.split(",");
            int rowInput = Integer.parseInt(values[0]);
            int colInput = Integer.parseInt(values[1]);

            boolean pieceAddStatus = gameBoard.addPiece(rowInput, colInput, currPlayer.getPlayerPiece());
            if(!pieceAddStatus){
                System.out.println("Incorrect Position Chosen, Try Again!");
                players.addFirst(currPlayer);
                continue;
            }
            players.addLast(currPlayer);

            boolean winner = checkWinner(rowInput, colInput, currPlayer.getPlayerPiece().getPieceType());
            if(winner){
                return currPlayer.getPlayerName();
            }
        }
        return "Tie";
    }

    public boolean checkWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;


        //need to check in row
        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.getSize();i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.getSize()-1; i<gameBoard.getSize(); i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}

