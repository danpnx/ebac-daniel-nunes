package org.example;

import java.lang.annotation.*;

/**
 * @author Daniel Augusto on 02/02/2023
 * @project annotations
 **/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {
    String value();
}
