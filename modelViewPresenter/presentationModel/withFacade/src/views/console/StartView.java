package views.console;

import controllers.Logic;
import controllers.StartController;
import models.Game;
import views.Message;
import views.WithLogicView;

public class StartView extends WithLogicView {

    public StartView(Logic logic) {
        super(logic);
    }

    public void interact() {
        Message.TITLE.writeln();
    }
}
