package views.graphics;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;

public class GraphicsView extends View {

    public GraphicsView(StartController startController, PlayController playController, ResumeController resumeController) {
        super(startController, playController, resumeController);
    }

    public void interact() {
       // TODO
    }

    public boolean toResume() {
        // TODO
        return true;
    }
}
