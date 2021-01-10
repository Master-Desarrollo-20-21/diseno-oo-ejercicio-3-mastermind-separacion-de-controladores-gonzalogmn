import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;

public abstract class Mastermind {
    private Game game;
    private View view;

    protected Mastermind() {
        this.game = new Game();
        this.view = this.createView(new StartController(game), new PlayController(game), new ResumeController(game));
    }

    public void play() {
        this.game = new Game();
        this.view = this.createView(new StartController(game), new PlayController(game), new ResumeController(game));
        this.view.interact();
        resume();
    }

    protected abstract View createView(StartController startController, PlayController playController, ResumeController resumeController);

    public void resume() {
        boolean resume = this.view.toResume();
        if(resume == true) {
            this.play();
        }
    }
}
