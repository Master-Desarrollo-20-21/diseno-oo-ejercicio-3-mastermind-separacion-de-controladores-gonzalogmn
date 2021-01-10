package views.console;

import controllers.ResumeController;
import models.Game;
import utils.YesNoDialog;
import views.Message;

public class ResumeView {
    private final ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    public boolean interact() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
