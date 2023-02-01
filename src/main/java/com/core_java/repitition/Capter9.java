package com.core_java.repitition;

import java.io.IOException;

class Exception {
    int[] nums = new int[4];

    //1,4
    void meth() {
        try {
            nums[7] = 5;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds exception");
            throw exc;
        }
    }

    //2
    static void method() {
        int[] array = new int[2];

        array[5] = 5;
    }

    //5
    void meth1() throws IOException {
        System.out.println("Enter symbol: ");
        System.in.read();
    }
}

public class Capter9 {
    public static void main(String[] args)
            throws ArithmeticException {
        //exception qcac method-um//1
        Exception ob = new Exception();
        /*ob.meth();
*/
        //exception grac methodum qcac classum//2
        try {
            Exception.method();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception 2");
        }

        //arithmetic exceptionin
        int i = 5, j = 0;
        try {
            System.out.println(i / j);
        }catch (ArithmeticException e){
            System.out.println("Hey");
        }

        System.out.println("Hello java");

        //throw-ov exception enq qcum method-um//3
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }catch (ArithmeticException exc){
            System.out.println(exc);
            exc.printStackTrace();
        }

        //repeat catching exceptions//4
        try{
            ob.meth();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of bounds: repeat");
            /*exc.printStackTrace();*/
        }finally {
            System.out.println("Hello");
        }

        //throws//5
        try{
            ob.meth1();
        }catch (IOException e){
            System.out.println("in exception");
        }
    }
}
