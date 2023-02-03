package org.example;

/**
 * @author Daniel Augusto on 03/02/2023
 * @project reflections
 **/
public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<TableClass> clazz = TableClass.class;

        String value = clazz.getAnnotation(Table.class).value();

        System.out.println("Nome da tabela: " + value);
    }
}
