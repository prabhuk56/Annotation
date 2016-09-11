/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.annotation;

/**
 *
 * @author sylvester
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface JavaFileInfo {
    String author() default "unknown";
    String version() default "0.0";    
    
}
@JavaFileInfo
public class DemoClass {
     @JavaFileInfo(author = "Lokesh", version = "1.0")
   public String getString()
   {
      return null;
   }
}
