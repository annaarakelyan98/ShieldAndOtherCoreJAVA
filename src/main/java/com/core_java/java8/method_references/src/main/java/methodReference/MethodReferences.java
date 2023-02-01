package com.core_java.java8.method_references.src.main.java.methodReference;

//method references

/*in generic types
 * if method is generic
 * interface_name mem = class_name::<Type> meth_name
 *
 * if class is generic
 * interface_name mem = class_name<Type>:: meth_name*/

//1//2//from book
interface IntPredicate {
    boolean test(int i);
}

//3
interface MyIntPredicates {
    boolean test(MyIntNum n, int m);
}

//1
class MyIntPredicate {
    static boolean isPrime(int m) {
        if (m < 2) return false;
        for (int i = 2; i <= m / i; i++) {
            if (m % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    static boolean isprime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }
}

//2//3
class MyIntNum {
    private int num;

    MyIntNum(int n) {
        this.num = n;
    }

    int getNum() {
        return num;
    }

    boolean isFactor(int v) {
        return (num % v) == 0;
    }
}

//3


public class MethodReferences {

    static boolean numTest(IntPredicate p, int k) {
        return p.test(k);
    }

    public static void main(String[] args) {
        boolean result;
        //1.static methods references//cherez class
        result = numTest(MyIntPredicate::isPrime, 7);
        if (result) System.out.println("5 is prime number");

        result = numTest(MyIntPredicate::isEven, 22);
        if (result) System.out.println("22 is even number");

        result = numTest(MyIntPredicate::isPositive, 5);
        if (result) System.out.println("5 is positive number");

        result = numTest(MyIntPredicate::isprime, 6);
        if (result) System.out.println("6 is composite number");

        //2//method reference// cherez object
        MyIntNum num1 = new MyIntNum(25);
        MyIntNum num2 = new MyIntNum(12);

        IntPredicate ip = num1::isFactor;
        result = ip.test(5);
        if (result) System.out.println("5 is divider of " + num1.getNum());

        ip = num2::isFactor;
        result = ip.test(3);
        if (result) System.out.println("3 is divider of " + num2.getNum());

        //3//method reference//cherez class
        MyIntNum num3 = new MyIntNum(36);
        MyIntNum num4 = new MyIntNum(6);

        MyIntPredicates inp = MyIntNum::isFactor;
        result = inp.test(num3, 2);
        if (result) {
            System.out.println("2 is divider of " + num3.getNum());
        }

        result = inp.test(num4, 3);
        if (result) {
            System.out.println("3 is divider of " + num4.getNum());
        }
    }
}
