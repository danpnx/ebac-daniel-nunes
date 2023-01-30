package org.example;

/**
 * @author Daniel Augusto on 30/01/2023
 * @project design-patterns-1
 **/
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says- 'Hello World!'");
    }
}
