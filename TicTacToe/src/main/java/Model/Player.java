package Model;

public class Player {
    private String playerName;
    private Piece playerPiece;

    public Player(String playerName, Piece playerPiece) {
        this.playerName = playerName;
        this.playerPiece = playerPiece;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Piece getPlayerPiece() {
        return playerPiece;
    }

    public void setPlayerPiece(Piece playerPiece) {
        this.playerPiece = playerPiece;
    }
}
