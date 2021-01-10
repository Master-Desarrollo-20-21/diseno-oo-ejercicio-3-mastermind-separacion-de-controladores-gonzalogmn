package views;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.console.PlayView;
import views.console.ResumeView;
import views.console.StartView;

public abstract class View {

    protected StartController startController;
    protected PlayController playController;
    protected ResumeController resumeController;

    public View(StartController startController, PlayController playController, ResumeController resumeController) {
        this.startController = startController;
        this.playController = playController;
        this.resumeController = resumeController;
    }

    public abstract void interact();

    public abstract boolean toResume();
}
