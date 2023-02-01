package com.core_java.java8.lamba_expression.src.main.java.lambda;
//lambda expressions and Functional Interfaces

public class LambdaExpression {
    public static void main(String[] args) {
        //1. from Arman
        Printable printable1 = (String greet) -> System.out.println(greet.toUpperCase());
        String greeting1 = "Hello Anna";

        printable1.print(greeting1);

        System.out.println();

        //2. from video java 1.8
        Runnable runnable = () -> System.out.println(("Hello Java").substring(0,5).toUpperCase());
        runnable.run();

        System.out.println();

        //3. from book
        //3.1//return hakadarc value
        GetValue getValue = (d) -> 1.0 / d;

        System.out.println("Hakadarc: " + getValue.getValue(4.0));

        System.out.println();

        //3.2//
        //2.1
        NumericTest isFactor = (x, y) -> (x % y) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 is divider of 10");
        }
        if (!isFactor.test(30, 9)) {
            System.out.println("9 isn't divider of 30");
        }

        System.out.println();

        //2.2
        NumericTest lessThan = (a, b) -> a > b;

        if (lessThan.test(5, 2)) {
            System.out.println("5 > 2");
        }

        if (!lessThan.test(2, 3)) {
            System.out.println("2 > 3 exception");
        }

        System.out.println();

        //2.3
        NumericTest absEqual = (m, n) -> (m < 0 ? -m : m) == (n < 0 ? -n : n);
        if (absEqual.test(-4, 4)) {
            System.out.println("-4 and 4 abs values are equals!");
        }
        if (!absEqual.test(-4, 5)) {
            System.out.println("-4 and 4 abs values aren't equals!");
        }

        System.out.println();

        //3.3
        StringTest stringTest = (str1, str2) -> str1.contains(str2);

        String str = "Hello Java!";

        System.out.println(str);

        if (stringTest.test(str, "Hello")) {
            System.out.println("Hello Java contains Hello!");
        }

        if (!stringTest.test(str, "Jungle")) {
            System.out.println("Hello Java doesn't contain Jungle!");
        }

        System.out.println();

        //3.4
        BlockLambda smallestF = (y) -> {
            int result = 1;

            y = y < 0 ? -y : y;
            for (int i = 2; i < y / i; i++) {
                if ((y % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        System.out.println("Smallest divider of 15: " + smallestF.func(-15));
        System.out.println("Smallest divider of 11: " + smallestF.func(11));

        System.out.println();

        //3.5
        NumTest<Integer> numTest = (n, m) -> (n % m == 0);
        if (numTest.test(10, 2)) {
            System.out.println("2 is divider of 10");
        }

        String str1 = "Hello World!";
        NumTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        if (isIn.test(str1, "Hello")) {
            System.out.println("Hello Java - contains Hello");
        }

        Runnable runnable1 = () -> System.out.println(str1.substring(6).toUpperCase());
        runnable1.run();

        System.out.println();

        //3.6//variable capture
        //modifier final//num has been used
        //in lambda-expression
        int num = 15;

        Numeric numeric = v -> {
            int k = num + v;
            return k;
        };

        System.out.println("Sum of 15 and 5: " + numeric.num(5));
    }
}

interface Numeric {
    int num(int n);
}

interface Printable {
    void print(String greeting);
}

interface GetValue {
    double getValue(double v);
}

interface NumericTest {
    boolean test(int n, int m);
}

interface StringTest {
    boolean test(String s1, String s2);
}

interface BlockLambda {
    int func(int x);
}

//generic functional interface
interface NumTest<T> {
    boolean test(T n, T m);
}

