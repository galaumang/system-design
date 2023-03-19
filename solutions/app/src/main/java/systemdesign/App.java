/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package systemdesign;

import systemdesign.snakeandladder.service.SnakeAndLadderGame;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        app.playSnakeAndLadder();
    }

    private void playSnakeAndLadder() {
        new SnakeAndLadderGame();
    }
}