package com.core_java.chapter_12_enumAutoboxingWrapper;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class AnnotationsReflectionExample1 {

    @MyAnnotation(str = "Annotation Example", val = 100)
    public static void myMeth() {

        AnnotationsReflectionExample1 annotation = new AnnotationsReflectionExample1();

        try {
            // First, get a Class object that represents
            // this class.
            Class<?> c = annotation.getClass();

            // Now, get a Method object that represents
            // this method.
            Method m = c.getMethod("myMeth");

            // Next, get the annotation for this class.
            MyAnnotation myAnno = m.getAnnotation(MyAnnotation.class);

            System.out.println(myAnno.str() + ": " + myAnno.val());
        } catch (NoSuchMethodException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
