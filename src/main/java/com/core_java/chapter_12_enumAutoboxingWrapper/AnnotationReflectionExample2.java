package com.core_java.chapter_12_enumAutoboxingWrapper;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno {
    String str();

    int val();
}

public class AnnotationReflectionExample2 {
    @Anno(str = "Annotation example", val = 200)
    public static void myMeth(String s, int v) {
        AnnotationReflectionExample2 example2 = new AnnotationReflectionExample2();
        try {
            Class<?> c = example2.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Anno anno = m.getAnnotation(Anno.class);

            System.out.println(anno.str() + ": " + anno.val());
        } catch (NoSuchMethodException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
