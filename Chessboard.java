package Chess;
import java.util.ArrayList;

public class Chessboard {
    
    public void newGame(ArrayList<Piece> board) {
        // Create all pieces for white side
        King wKing = new King(4, 0);
        Queen wQueen = new Queen(3, 0);
        Bishop wBishop1 = new Bishop(2, 0);
        Bishop wBishop2 = new Bishop(5, 0);
        Knight wKnight1 = new Knight(1, 0);
        Knight wKnight2 = new Knight(6, 0); 
        Rook wRook1 = new Rook(0,0);
        Rook wRook2 = new Rook(7,0);
        Pawn wPawn1 = new Pawn(0,1);
        Pawn wPawn2 = new Pawn(1,1);
        Pawn wPawn3 = new Pawn(2,1);
        Pawn wPawn4 = new Pawn(3,1);
        Pawn wPawn5 = new Pawn(4,1);
        Pawn wPawn6 = new Pawn(5,1);
        Pawn wPawn7 = new Pawn(6,1);
        Pawn wPawn8 = new Pawn(7,1);
        // Create all pieces for black side
        King bKing = new King(4, 7);
        Queen bQueen = new Queen(3, 7);
        Bishop bBishop1 = new Bishop(2, 7);
        Bishop bBishop2 = new Bishop(5, 7);
        Knight bKnight1 = new Knight(1, 7);
        Knight bKnight2 = new Knight(6, 7); 
        Rook bRook1 = new Rook(0,7);
        Rook bRook2 = new Rook(7,7);
        Pawn bPawn1 = new Pawn(0,6);
        Pawn bPawn2 = new Pawn(1,6);
        Pawn bPawn3 = new Pawn(2,6);
        Pawn bPawn4 = new Pawn(3,6);
        Pawn bPawn5 = new Pawn(4,6);
        Pawn bPawn6 = new Pawn(5,6);
        Pawn bPawn7 = new Pawn(6,6);
        Pawn bPawn8 = new Pawn(7,6);
        // Add all pieces to board list
        board.add(wKing);
        board.add(wQueen);
        board.add(wBishop1);
        board.add(wBishop2);
        board.add(wKnight1);
        board.add(wKnight2);
        board.add(wRook1);
        board.add(wRook2);
        board.add(wPawn1);
        board.add(wPawn2);
        board.add(wPawn3);
        board.add(wPawn4);
        board.add(wPawn5);
        board.add(wPawn6);
        board.add(wPawn7);
        board.add(wPawn8);
        board.add(bKing);
        board.add(bQueen);
        board.add(bBishop1);
        board.add(bBishop2);
        board.add(bKnight1);
        board.add(bKnight2);
        board.add(bRook1);
        board.add(bRook2);
        board.add(bPawn1);
        board.add(bPawn2);
        board.add(bPawn3);
        board.add(bPawn4);
        board.add(bPawn5);
        board.add(bPawn6);
        board.add(bPawn7);
        board.add(bPawn8);
    }

    public static void main(String[] args) {
        ArrayList<Piece> board = new ArrayList<>();
        Chessboard currentGame = new Chessboard();
        currentGame.newGame(board);
    }




}
