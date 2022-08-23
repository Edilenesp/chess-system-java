package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/*Esta classe é uma subClasse de Piece e por isto é obrigatório ter o construtor aqui */
public abstract class ChessPiece extends Piece{
	private Color color;
	private int moveCount;

	
	public int getMoveCount() {
		return moveCount;
	}

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	} 
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

	/* O set foi removido por que eu não quero que a cor seja modificada apenas acessada.
	public void setColor(Color color) {
		this.color = color;
	}
	*/
	
}
