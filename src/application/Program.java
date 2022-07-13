package application;

import java.util.Scanner;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
//import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		/*Position pos = new Position(3, 5);
		System.out.println(pos);*/
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc); 
			
			ChessPiece capturePiece = chessMatch.performChessMove(source, target);
		}
		
		
	}

}
