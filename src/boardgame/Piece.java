package boardgame;

import java.util.Iterator;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	/*
	 * Este get ficará "protected", por que somente classes dentro do mesmo pacote e subclasses poderá acessar o 
	 * tabuleiro de uma peça.
	 * Eu não vou querer que o tabuleiro seja acessível pela a camada de xadrex.
	 * Esse tabuleiro ele é de uso interno da camada de tabuleiro.
	 * Por isso ele tem que ser protegido.
	 * */
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean [][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove(){
		boolean [][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]){
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * O setter de board será retirado pois não quero que o meu tabuleiro seja alterado.
	 * public void setBoard(Board board) {
		this.board = board;
	}*/

	/*Construtor ficará apenas com o board e poisition já é padrão ser null quando não atribui nenhum valor
	 * mas neste caso foi colocado só para ficar visível o valor de position, fora que position terá position null
	 * por que no momento em que ela é criada ainda não tem nenhuma posição. 
	 * */
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	
}
