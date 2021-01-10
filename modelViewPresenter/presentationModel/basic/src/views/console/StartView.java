package views.console;

import controllers.StartController;
import models.Game;
import views.Message;

public class StartView {
    private final StartController startController;

    public StartView(StartController startController) {
        this.startController = startController;
    }

    public void interact() {
        Message.TITLE.writeln();
    }
}
