package views.console;

import controllers.Logic;
import controllers.ResumeController;
import models.Game;
import utils.YesNoDialog;
import views.Message;
import views.WithLogicView;

public class ResumeView extends WithLogicView {

    public ResumeView(Logic logic) {
        super(logic);
    }

    public boolean interact() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
