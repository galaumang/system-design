package systemdesign.snakeandladder.service;

import systemdesign.snakeandladder.model.Board;
import systemdesign.snakeandladder.model.Player;

import java.util.HashMap;
import java.util.Scanner;

public class SnakeAndLadderGame {
    Board board;
    HashMap<String, Player> players;

    public SnakeAndLadderGame() {
        board = new Board();
        this.players = new HashMap<>();
        setupBoard();
        System.out.println("Starting the game ...");
        board.playGame(players);
    }

    public void setPlayer(String name) {
        players.put(name, new Player(name));
    }

    public void setupBoard() {
        Scanner sc = new Scanner(System.in);
        int noOfSnakes = sc.nextInt();
        for (int index = 0; index < noOfSnakes; index++) {
            board.setSnake(sc.nextInt(), sc.nextInt());
        }
        int noOfLadders = sc.nextInt();
        for (int index = 0; index < noOfLadders; index++) {
            board.setLadder(sc.nextInt(), sc.nextInt());
        }
        int noOfPlayers = sc.nextInt();
        for (int index = 0; index < noOfPlayers; index++) {
            setPlayer(sc.next());
        }
        sc.close();
    }
}
