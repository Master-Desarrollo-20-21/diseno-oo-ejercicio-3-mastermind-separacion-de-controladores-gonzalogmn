package views.console;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(StartController startController, PlayController playController, ResumeController resumeController) {
        super(startController, playController, resumeController);
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
    }

    public void interact() {
        this.startView.interact();
        this.playView.interact();
    }

    public boolean toResume() {
        return this.resumeView.interact();
    }
}
