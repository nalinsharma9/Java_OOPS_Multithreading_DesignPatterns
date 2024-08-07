package Design_Patterns.TicTacToeLLD;

import Design_Patterns.TicTacToeLLD.Model.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;

public class TicTacToeGame {
    Queue<Player> players;
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        //creating 2 Players
        players = new LinkedList<>();
        PlayingPiece XPiece = new PlayingPieceX();
        PlayingPiece OPiece = new PlayingPieceO();
        Player player1 = new Player("Player1", XPiece);
        Player player2 = new Player("Player2", OPiece);

        players.add(player1);
        players.add(player2);

        //InitializeBoard
        gameBoard = new Board(3);
    }
}
