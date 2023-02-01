package com.core_java.gorcnakan_Arman_1;

public class Capter6Demo {
    public static void main(String[] args) {
        Capter6 boy = new Capter6();

        Capter6 cube1 = new Capter6(2, 5, 8);
        Capter6 cube2 = new Capter6(2, 5, 8);
        Capter6 cube3 = new Capter6(4, 5, 4);

        Capter6 sum = new Capter6(6, 10);

        Capter6 num = new Capter6(5);
        Capter6 num1 = new Capter6(num);

        Capter6 ob = new Capter6();

        Capter6 ob1 = new Capter6();

        boy.setName("Narek");
        boy.surname = "Galstyan";

        System.out.println(boy.getName() + " is my friend.");
        System.out.println("His surname is " + boy.surname + ".");

        System.out.println("cube1 and cube2 have the same members: " + cube1.sameBlock(cube2) + " : " + cube1.a
                + " " + cube1.b + " " + cube1.c);
        System.out.println("cube2 and cube3 have the same members: " + cube2.sameBlock(cube3));
        System.out.println("cube2 and cube3 have the same volume: " + cube2.sameVolume(cube3) + " : "
                + cube3.volume);

        System.out.println("sum: " + sum.sum(sum));

        System.out.println("Sum of num: " + num.sum);
        System.out.println("Sum of num2: " + num1.sum);

        System.out.println("Factorial: " + ob.factR(5));

        ob1.x = 10;
        Capter6.y = 25;

        System.out.println("x & y sum: " + ob1.sum());
        System.out.println("z is static member of class Capter6: " + Capter6.z);
    }
}
