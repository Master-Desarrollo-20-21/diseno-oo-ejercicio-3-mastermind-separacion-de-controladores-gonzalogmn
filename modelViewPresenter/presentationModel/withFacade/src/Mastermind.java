import controllers.Logic;
import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import views.View;

public abstract class Mastermind {
    private Logic logic;
    private View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView(this.logic);
    }

    public void play() {
        this.logic = new Logic();
        this.view = this.createView(this.logic);
        this.view.interact();
        resume();
    }

    protected abstract View createView(Logic logic);

    public void resume() {
        boolean resume = this.view.toResume();
        if(resume == true) {
            this.play();
        }
    }
}
