package views.console;

import controllers.PlayController;
import models.Game;
import utils.Console;
import views.Message;

import java.util.ArrayList;
import java.util.List;

public class PlayView {
    private final PlayController playController;
    private List<AttemptView> attemptViews;

    public PlayView(PlayController playController) {
        this.playController = playController;
        this.attemptViews = new ArrayList<>();
    }

    public void interact() {
        for(int i = 0; i < playController.getMaxAttempts(); i++) {
                      Message.LINE_BREAK.writeln();
            Console.getInstance().writeln(i+1 + " " + Message.ATTEMPTS);
            Message.SECRET_COMBINATION.writeln();
            AttemptView attemptView = new AttemptView(playController.getAttempt(i));
            attemptViews.add(attemptView);
            printPlayedAttempts();
            attemptView.interact();
            if(attemptView.isSucessful()) {
                Message.WIN.writeln();
                return;
            }
        }
        Message.LOSE.writeln();
    }

    private void printPlayedAttempts() {
        for(AttemptView attemptView : attemptViews) {
            attemptView.printResult();
        }
    }
}
