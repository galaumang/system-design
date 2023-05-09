package systemdesign.snakeandladder.model;

import java.util.HashMap;

public class Board {
    HashMap<Integer, Integer> snakes;
    HashMap<Integer, Integer> ladders;
    Dice dice;

    public Board() {
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        this.dice = new Dice(6);
    }

    public void playGame(HashMap<String, Player> players) {
        boolean winner = false;
        while (!winner) {
            for (String player : players.keySet()) {
                StringBuilder move = new StringBuilder();
                Player curPlayer = players.get(player);
                String snakesOrLadder = "";
                int diceRoll = dice.rollDice();
                int playerCurPos = curPlayer.getCurrentPosition();
                int playerNewPos = playerCurPos + diceRoll;

                if (playerNewPos > 100) {
                    playerNewPos = playerCurPos;
                }
                if (snakes.containsKey(playerNewPos)) {
                    snakesOrLadder = " after Snake bite";
                    playerNewPos = snakes.get(playerNewPos);
                }
                if (ladders.containsKey(playerNewPos)) {
                    snakesOrLadder = " after Ladder ride";
                    playerNewPos = ladders.get(playerNewPos);
                }
                curPlayer.setCurrentPosition(playerNewPos);
                players.put(player, curPlayer);

                move.append(player).append(" rolled a ").append(diceRoll).append(" and moved from ");
                move.append(playerCurPos).append(" to ").append(playerNewPos).append(snakesOrLadder);
                System.out.println(move);

                if (playerNewPos == 100) {
                    winner = true;
                    System.out.println(player + " wins the game");
                    break;
                }
            }
        }
    }

    public void setSnake(int head, int tail) {
        snakes.put(head, tail);
    }

    public void setLadder(int start, int end) {
        ladders.put(start, end);
    }
}
