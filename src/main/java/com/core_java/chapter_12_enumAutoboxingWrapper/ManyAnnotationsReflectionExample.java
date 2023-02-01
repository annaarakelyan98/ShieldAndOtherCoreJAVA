package com.core_java.chapter_12_enumAutoboxingWrapper;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "An annotation test class")
@MyAnnotation(str = "ManyAnnotationsReflectionExample", val = 99)
public class ManyAnnotationsReflectionExample {

    @MyAnnotation(str = "Testing", val = 100)
    @What(description = "An annotation test method")
    public static void myAnnoMethod() {
        ManyAnnotationsReflectionExample example = new ManyAnnotationsReflectionExample();

        try {
            Annotation[] annotations = example.getClass().getAnnotations();

            System.out.println("All annotations for ManyAnnotationsReflectionExample");
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            System.out.println("\nAll annotations for myAnnoMethod");

            Method m = example.getClass().getMethod("myAnnoMethod");

            annotations = m.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myAnnoMethod();
    }
}
/*Annotation's default value example
*
* @Retention(RetentionPolicy.RUNTIME)
* @interface MyAnno {
*   String str() default "Testing";
*   int val() default 9000;
* }
*
* @MyAnno() // both str and val default
* @MyAnno(str = "some string") // val defaults
* @MyAnno(val = 100) // str defaults
* @MyAnno(str = "Testing", val = 100) // no defaults
* */