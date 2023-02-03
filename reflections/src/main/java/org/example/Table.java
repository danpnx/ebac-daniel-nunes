package org.example;

/**
 * @author Daniel Augusto on 03/02/2023
 * @project reflections
 **/

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {
    String value();
}