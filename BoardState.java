import java.util.ArrayList;
import java.io.Serializable;

public class BoardState  implements Serializable {
    //must be defined to implement serializable
    private static final long serialVersionUID = 44005L;
    public Move initiatingMove;
    public int desirability;
    public BoardState parent;
    public int[][] positions;
    public ArrayList<Move> validMoves;
    //this is the map that stores what moves turn into what
    //board states
    public ArrayList<BoardState> knownMoves;
    public boolean whitesTurn;
    //these are used to determine if a player can castle
    public boolean whiteKingMoved;
    public boolean blackKingMoved;
    public boolean whiteRook0Moved;
    public boolean blackRook0Moved;
    public boolean whiteRook7Moved;
    public boolean blackRook7Moved;

    public BoardState() {
        //initialize variables in default states
        desirability = 
        positions = new int[8][8];
        knownMoves = new ArrayList<BoardState>();
        validMoves = new ArrayList<Move>();
        whitesTurn = true;
        whiteKingMoved = false;
        blackKingMoved = false;
        whiteRook0Moved = false;
        whiteRook7Moved = false;
        blackRook0Moved = false;
        blackRook7Moved = false;
        return;
    }

    public void setupInitialBoard() {
        return;
    }

    public void move(int oldX, int oldY, int newX, int newY) {
        return;
    }

    public void branch(Move branchingMove) {
        return;
    }

    public void explode(int x, int y) {
        return;
    }

    public boolean checkVictory() {
        return false;
    }

    public boolean lookAhead(int turns) {
        return false;
    }

    public boolean isValid(Move move) {
        return true;
    }

    public boolean opponentMoveTo(int x, int y) {
        return true;
    }

    public void generateValidMoves() {
        return;
    }

    private ArrayList<Move> removeSuicideMoves(ArrayList<Move> moves) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> pawnMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> rookMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> knightMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> bishopMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> queenMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> kingMoves (int x, int y) {
        return new ArrayList<Move>();
    }

    private ArrayList<Move> directionalMoves (int x, int y, int dirX, int dirY) {
        return new ArrayList<Move>();
    }

    public boolean containsMove(ArrayList<Move> arrayList, Move move) {
        return true;
    }

    public void serialize() {
        return;
    }

    public void deserialize() {
        return;
    }
}