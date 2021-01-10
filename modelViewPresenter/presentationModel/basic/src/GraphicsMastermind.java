import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;
import views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView(StartController startController, PlayController playController, ResumeController resumeController) {
        return new GraphicsView(startController, playController, resumeController);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
