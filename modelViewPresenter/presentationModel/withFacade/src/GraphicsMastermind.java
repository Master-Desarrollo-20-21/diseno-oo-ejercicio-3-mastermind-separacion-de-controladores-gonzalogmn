import controllers.Logic;
import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;
import views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView(Logic logic) {
        return new GraphicsView(logic);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
