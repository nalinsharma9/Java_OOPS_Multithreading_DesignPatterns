package Design_Patterns.TicTacToeLLD;

import Design_Patterns.TicTacToeLLD.Model.*;

import java.util.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.AbstractMap.SimpleEntry;

public class TicTacToeGame {
    Deque<Player> players;
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

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            //take out player whose turn it is and also put back in the list
            Player playerTurn = players.removeFirst();

            //get free spaces from board
            gameBoard.printBoard();
            List<SimpleEntry<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();

            if(freeSpaces.isEmpty()){
                noWinner= false;
                continue;
            }

            //read the user input
            System.out.println("Player:" + playerTurn.name + " Enter row,column");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                //player cannot insert piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i = 0; i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i = 0; i<gameBoard.size; i++){
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType){
                columnMatch = false;
            }
        }

        //need to check in diagonal
        for(int i =0; i<gameBoard.size; i++){
            if(gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != pieceType){
                diagonalMatch = false;
            }
        }

        //need to check in anti-diagonal
        for(int i=0, j = gameBoard.size-1; i<gameBoard.size; i++, j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
