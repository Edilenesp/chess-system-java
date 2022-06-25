package chess;

import java.util.Iterator;

import boardgame.Board;

/*Esta classe é o coração de nosso sistema é nela que irá ter as regras do jogo de xadrez*/
public class ChessMatch {
	//Partida de xadrez necessita de um tabuleiro
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
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

}
