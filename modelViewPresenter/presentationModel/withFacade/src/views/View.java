package views;

import controllers.Logic;

public abstract class View extends WithLogicView {

    public View(Logic logic) {
        super(logic);
    }

    public abstract void interact();

    public abstract boolean toResume();
}
