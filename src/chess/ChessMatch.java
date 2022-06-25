package chess;

import java.util.Iterator;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

/*Esta classe é o coração de nosso sistema é nela que irá ter as regras do jogo de xadrez*/
public class ChessMatch {
	//Partida de xadrez necessita de um tabuleiro
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece [board.getRows()][board.getColumn()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}

}
