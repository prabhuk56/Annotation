/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author sylvester
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AnnotationInterface {
    String name() default "Name of the person";
    int age() default 18;
    String[] friends();
}
