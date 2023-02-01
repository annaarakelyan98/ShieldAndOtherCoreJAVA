package com.core_java.chapter_3_loops;

import java.io.IOException;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) throws IOException {
        //Arithmetic operators
        Scanner num = new Scanner(System.in);
        int i, j;
        i = 10;
        System.out.print("j is: ");
        j = num.nextInt();

        if (i < j) {
            System.out.println("i<j");
        }
        if (i != j) {
            System.out.println("i!=j");
        }
        if (i <= j) {
            System.out.println("i<=j");
        }
        if (i > j) {
            System.out.println("i>j");
        }
        if (i >= j) {
            System.out.println("i>=j");
        }
        if (i == j) {
            System.out.println("i==j");
        }
        System.out.print("\n");

        //boolean operators
        boolean b1, b2;
        b1 = true;
        b2 = false;
        if (b1 & b2) {
            System.out.println("false, bayc chi tpelu!");
        }
        if (b1 | b2) {
            System.out.println("true1");
        }
        if (b1 ^ b2) {
            System.out.println("true2");
        }
        if (!(b1 & b2)) {
            System.out.println("true3\n");
        }

        /*
        1)&&, || ev 2)&, | difference;
        1)test/check only first condition, than make decision
        2) check both conditions, than make decision : true or false
         */
        Float d, k, l;
        d = 40F;
        System.out.print("l is: ");
        l = num.nextFloat();
        System.out.print("k is: ");
        k = num.nextFloat();

        if (k != 0 && (d % k) == 0) {
            System.out.println("&&-ov chisht");
        }
        if (k >= 0 || (l / k) > 0) {
            System.out.println("||-ov chisht");
        }
        //difference && and &
        int a;
        int b;
        a = b = 12;//make value
        if (false && (a++ < 100)) {
            System.out.println("chi tpelu");
        }
        System.out.println("a: " + a);
        if (false & (b++ < 20)) {
            System.out.println("chka tox");
        }
        System.out.println("b: " + b + "\n");

        //short operations/ +=, -=, /=, *=, &=, |=, ^=, %=
        int x, y, z, u, s;
        boolean p, q, e;

        x = y = z = u = s = 9;

        x += 8;
        y -= 7;
        z /= 3;
        u *= 2;
        s %= 3;
        System.out.println("x now is: " + x);
        System.out.println("y now is: " + y);
        System.out.println("z now is: " + z);
        System.out.println("u now is: " + u);
        System.out.println("s now is: " + s);

        //
        p = true;
        q = e = false;
        p ^= true;
        q |= true;
        e &= true;
        System.out.println(p + " and " + q + " and " + e);

        //from double to int
        double n, m;
        int t;
        n = 6.0;
        m = 2.2;
        t = (int) (n / m);//mec@ poqri
        System.out.println(t);

        //from int to double
        double g;
        int f, h;
        f = 15;
        h = 2;
        g = f / h;
        System.out.println(g);

        //book example
        boolean r, w;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        r = true;
        w = true;
        System.out.print(r + "\t" + w + "\t");
        System.out.print((r & w) + "\t" + (r | w) + "\t");
        System.out.println((r ^ w) + "\t" + (!r));

        r = true;
        w = false;
        System.out.print(r + "\t" + w + "\t");
        System.out.print((r & w) + "\t" + (r | w) + "\t");
        System.out.println((r ^ w) + "\t" + (!r));

        r = false;
        w = true;
        System.out.print(r + "\t" + w + "\t");
        System.out.print((r & w) + "\t" + (r | w) + "\t");
        System.out.println((r ^ w) + "\t" + (!r));

        r = false;
        w = false;
        System.out.print(r + "\t" + w + "\t");
        System.out.print((r & w) + "\t" + (r | w) + "\t");
        System.out.println((r ^ w) + "\t" + (!r) + "\n");

        //type changing in expression
        //1
        int o;
        byte v;
        v = 10;
        o = v * v;//int type

        v = (byte) (v * v);//tip@ byte
        System.out.println("o and v: " + o + " and " + v);

        //2
        char ch1, ch2;
        int in;
        ch1 = 'a';
        ch2 = 'b';
        in = ch1 + ch2;//int
        ch1 = (char) (ch1 + ch2);//char
        System.out.println("char and int: " + ch1 + " and " + in + "\n");

        //3
        int i1;
        for (i1 = 0; i1 < 7; i1++) {
            System.out.println(i1 + "/3: " + i1 / 3 + " :int");
            System.out.println(i1 + "/3: " + (double) i1 / 3 + ": by dot/double\n");
        }

        //
        //1 from keyboard
        /*char ch3;
        System.out.print("Symbol after Enter: ");
        ch3 = (char) System.in.read();
        System.out.println("Symbol is: " + ch3);
*/
        //2 if- else-if
        char ch4, answer;
        answer = 'F';
        System.out.print("print from A to Z: ");

        ch4 = (char) System.in.read();

        if (ch4 == answer) {
            System.out.println("Right!");
        } else if (ch4 > answer) {
            System.out.print("You ain't correct... end!");
        } else {
            System.out.println(" You ain't correct... start!");
        }
        System.out.println();

        //switch
        int i3;
        System.out.print("i3 is: ");
        i3 = num.nextInt();
        switch (i3) {
            case 3:
                System.out.println("i3 equal to 3");
                break;
            case 12:
                System.out.println("i3 equal to 12");
                break;
            case 45:
                System.out.println("i3 equal to 45");
                break;
            default:
                System.out.println("Other number!");
        }
    }
}
