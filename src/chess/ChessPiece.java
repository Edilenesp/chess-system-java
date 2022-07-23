package chess;

import boardgame.Board;
import boardgame.Piece;

/*Esta classe é uma subClasse de Piece e por isto é obrigatório ter o construtor aqui */
public abstract class ChessPiece extends Piece{
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/* O set foi removido por que eu não quero que a cor seja modificada apenas acessada.
	public void setColor(Color color) {
		this.color = color;
	}
	*/
	
}
