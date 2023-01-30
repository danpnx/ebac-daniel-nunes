package org.example;

/**
 * @author Daniel Augusto on 30/01/2023
 * @project design-patterns-1
 **/
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button using Java Swing");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Exit'");
    }
}
