package org.example;

/**
 * @author Daniel Augusto on 30/01/2023
 * @project design-patterns-1
 **/
public class Demo {
    public static void main(String[] args) {
        Dialog dialog = configure();
        dialog.renderComponent();
    }

    private static Dialog configure() {
        if(System.getProperty("os.name").equals("Windows 10")) return new WindowsDialog();
        else return new HtmlDialog();
    }
}
