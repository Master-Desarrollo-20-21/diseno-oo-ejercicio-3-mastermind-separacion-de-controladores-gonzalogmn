package controllers;

import models.Attempt;
import models.Game;

public class PlayController extends Controller {
    public PlayController(Game game) {
        super(game);
    }

    public int getMaxAttempts() {
        return this.game.getMaxAttempts();
    }

    public Attempt getAttempt(int attemptNumber) {
        assert attemptNumber > 0 && attemptNumber < getMaxAttempts();
        return this.game.getAttempt(attemptNumber);
    }
}