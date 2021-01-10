package controllers;

import models.Attempt;
import models.Game;

public class Logic {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;

    public Logic() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public int getMaxAttempts() {
        return this.playController.getMaxAttempts();
    }

    public Attempt getAttempt(int attemptNumber) {
        return this.playController.getAttempt(attemptNumber);
    }

}
