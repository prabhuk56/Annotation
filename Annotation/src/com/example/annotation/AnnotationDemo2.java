/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.annotation;

/**
 *
 * @author sylvester
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.InvocationTargetException;

class AnnotationDemo2 {
    public static void main(String... args) {
        AnnotationTest at = new AnnotationTest();
        for (Method m : at.getClass().getMethods()) {
           MethodXY mXY = (MethodXY)m.getAnnotation(MethodXY.class);
           if (mXY != null) {
               if (mXY.x() == 3 && mXY.y() == 2){
                   try {
                       m.invoke(at);
                   } catch (IllegalAccessException e) {
                       //do nothing;
                   } catch (InvocationTargetException o) {
                       //do nothing;
                   }
               }
           }
        }
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    static public @interface MethodXY {
        public int x();
        public int y();
    }

    static class AnnotationTest {
        @MethodXY(x=5, y=5)
        public void myMethodA() {
            System.out.println("boo");
        }

        @MethodXY(x=3, y=2)
        public void myMethodB() {
            System.out.println("foo");
        }
    }
}   

