import controllers.Logic;
import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;
import views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(Logic logic) {
        return new ConsoleView(logic);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

}
