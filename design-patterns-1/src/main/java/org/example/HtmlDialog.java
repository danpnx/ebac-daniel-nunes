package org.example;

/**
 * @author Daniel Augusto on 30/01/2023
 * @project design-patterns-1
 **/
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
