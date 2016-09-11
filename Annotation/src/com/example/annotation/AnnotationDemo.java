/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.annotation;
import com.example.Controller.*;
import java.lang.annotation.Annotation;
import java.util.Scanner;
/**
 *
 * @author prabhu
 */

public class AnnotationDemo {
    Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Annotation Starts.." );
       /* AnnotationInterface annotationInterface=new AnnotationInterface() {

            @Override
            public String name() {
                try{
                System.out.println("inside name"); 
                return "Prabhu";
                }
                catch(UnsupportedOperationException u){
                    return  u.toString();
                }
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int age() {
                System.out.println("inside age");                
                 try{
                System.out.println("inside name"); 
                return 24;
                }
                catch(UnsupportedOperationException u){
                    System.out.println(u.toString());
                    return 18;
                }
            }

            @Override
            public String[] friends() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Class<? extends Annotation> annotationType() {
                System.out.println("inside public class");
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };*/
        AnnotationInterface annotationInterface=new AnotationInterface();
        System.out.println("Person name:"+annotationInterface.name());
        System.out.println("Person age:"+annotationInterface.age());
        System.out.println("Person Friends:"+annotationInterface.friends());
        
    }
    
}
