package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
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
		List<ChessPiece> captured = new ArrayList<>();
		
		while (true) {
			try {
			UI.clearScreen();
			UI.printMatch(chessMatch, captured);
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			boolean [][] possibleMoves = chessMatch.possibleMoves(source);
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces(), possibleMoves);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc); 
			
			ChessPiece capturePiece = chessMatch.performChessMove(source, target);
			
			if (capturePiece != null) {
				captured.add(capturePiece);
			}
			
			}catch (ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		
	}

}
