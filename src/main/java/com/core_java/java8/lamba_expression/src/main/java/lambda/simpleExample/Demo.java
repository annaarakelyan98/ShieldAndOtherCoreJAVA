package com.core_java.java8.lamba_expression.src.main.java.lambda.simpleExample;

public class Demo {
    public static void main(String[] args) throws EmptyArrayException {
        //ex. 1
        MyNumber number;

        number = () -> 12.5;

        System.out.println("My number: " + number.getValue());

        number = () -> Math.random() * 100;

        System.out.println("Random number: " + number.getValue());

        //ex.2
        NumericTest numericTest = (n) -> n + n;
        System.out.println("Double value: " + numericTest.getSum(12));

        //ex.3//
        NumTest numTest = n -> (n % 2 == 0);
        if (!numTest.test(15)) System.out.println("15 is odd");
        if (numTest.test(10)) System.out.println("10 is even");

        NumTest num = (n) -> n >= 0;
        if (num.test(1)) System.out.println("1 is more than 0");
        if (!num.test(-1)) System.out.println("-1 is less than 0");

        //ex.4//two params
        NumTestFactor numTestFactor = (i, j) -> (i % j == 0);
        if (numTestFactor.isFactor(10, 5)) System.out.println("5 is divider of 10");
        if (!numTestFactor.isFactor(9, 4)) System.out.println("4 isn't divider of 9");

        //ex. 5//lambda's block example
        NumericFunc numericFunc = n -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of 3: " + numericFunc.fact(3));
        System.out.println("Factorial of 7: " + numericFunc.fact(5));

        //ex. 6//lambda's block example
        StringFunc stringFunc = n -> {
            String result = "";

            for (int i = n.length() - 1; i >= 0; i--)
                result += n.charAt(i);

            return result;
        };

        System.out.println("Anna reverse: " + stringFunc.test("Anna"));
        System.out.println("Poxos reverse: " + stringFunc.test("Poxos"));

        //ex. 7//lambda's generic type
        SomeFunc<String> testString = n -> {
            String result = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };

        System.out.println("Gen test: string : Hello reverse: " + testString.test("Hello"));

        SomeFunc<Integer> testInteger = n -> {
            int result = 1;

            for (int i = 1; i < n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Gen test: int: " + testInteger.test(6));

        //ex. 8//lambda as an argument for function
        String in = "Hello Java!";
        String out = "";

        System.out.println("Inner string is: " + in);

        //
        out = stringOp(str -> in.toUpperCase(), in);
        System.out.println("Uppercase: " + out);

        //
        out = stringOp(str -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, in);

        System.out.println("Remove spaces: " + out);

        //
        StringFunc stringFunc1 = n -> {
            String result = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };

        out = stringOp(stringFunc1, in);
        System.out.println("Reverse: " + out);

        //ex.9//exceptions
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] ar = {};

        DoubleNumArrayFunc d = n -> {
            double average = 0;

            if (n.length == 0) throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++) {
                average += n[i];
            }
            return average / n.length;
        };

        System.out.println("Average: " + d.func(array));
        /*System.out.println("Throw EmptyArrayException(): " + d.func(ar) or d.func(new double[0]));*/

        //ex.10//modifier example
        int n = 10;
        NumericTest numericTest1 = n1 -> {
            int value = n + n1;
            //n++;or n=5+n1; or n=9; it's exception
            //because we can't do anything with
            // enclosing variable, it effectively final
            return value;
        };

        System.out.println(numericTest1.getSum(5));
    }

    static String stringOp(StringFunc strF, String str) {
        return strF.test(str);
    }
}
