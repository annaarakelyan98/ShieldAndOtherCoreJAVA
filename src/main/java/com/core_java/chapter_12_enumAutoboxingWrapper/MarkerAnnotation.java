package com.core_java.chapter_12_enumAutoboxingWrapper;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnno {
}


public class MarkerAnnotation {
    @MarkerAnno
    public static void myMethod() {
        MarkerAnnotation annotation = new MarkerAnnotation();

        try {
            Method m = annotation.getClass().getMethod("myMethod");
            if (m.isAnnotationPresent(MarkerAnno.class)) {
                System.out.println("Marker annotation is present!");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("No such method!");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
