package com.core_java.java8.method_references.src.main.java.methodReference.simpleExamples;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //ex.1//static method ref
        String in = "Hello World!";
        String out;

        out = stringOp(StringReverse::toReverse, in);

        System.out.println("inner: " + in);
        System.out.println("outer: reverse: " + out);

        //ex.2//object ref
        StringUppercase uppercase = new StringUppercase();
        out = stringOp(uppercase::toUppercase, in);
        System.out.println("outer: uppercase: " + out);

        //ex.3//
    }

    //ex.1
    static String stringOp(StringFunc str, String s) {
        return str.func(s);
    }
}

//ex.1
class StringReverse {
    static String toReverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }
}

//ex.2
class StringUppercase {
    String toUppercase(String s) {
        String str = "";
        for (int i = 0; i <= s.length(); i++) {
            str = s.toUpperCase();
        }
        return str;
    }
}