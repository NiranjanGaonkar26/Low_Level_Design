package Model;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Board {

    private int size;
    public Piece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[this.size][this.size];
    }

    public boolean addPiece(int row, int column, Piece piece){
        if(board[row][column] != null){
            return false;
        }
        board[row][column] = piece;
        return true;
    }

    public List<Map.Entry<Integer, Integer>> getFreeCells(){
        List<Map.Entry<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if(board[i][j] == null){
                    Map.Entry<Integer, Integer> rowColVal = new AbstractMap.SimpleEntry<>(i, j);
                    freeCells.add(rowColVal);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
