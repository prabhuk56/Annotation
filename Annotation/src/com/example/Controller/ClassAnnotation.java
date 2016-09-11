/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

/**
 *
 * @author sylvester
 */
public @interface ClassAnnotation {
    String name() default "Name of the person";
    int age() default 18;
    String[] friends();
}
