package org.example;

/**
 * @author Daniel Augusto on 30/01/2023
 * @project design-patterns-1
 **/
public abstract class Dialog {
    public void renderComponent() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
