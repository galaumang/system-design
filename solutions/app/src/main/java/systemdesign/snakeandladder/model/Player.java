package systemdesign.snakeandladder.model;

public class Player {
    String name;

    int currentPosition;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
