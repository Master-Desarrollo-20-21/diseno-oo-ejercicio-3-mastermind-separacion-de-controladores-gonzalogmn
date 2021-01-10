import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;
import views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(StartController startController, PlayController playController, ResumeController resumeController) {
        return new ConsoleView(startController, playController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
