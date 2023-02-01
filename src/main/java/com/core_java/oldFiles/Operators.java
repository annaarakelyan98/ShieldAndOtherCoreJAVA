package com.core_java.oldFiles;

public class Operators {
    public static void main(String[] args) {
        //using int
        System.out.println("Integer Arithmetic ");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //using double
        System.out.println("\n Floating Point Arithmetic ");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        //modulus operator
        int x = 42;
        double y = 42.25;
        System.out.println("\nx mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        //asignment operators
        int m = 1;
        int n = 2;
        int l = 3;
        m += 5;
        n *= 4;
        l += a * b;
        l %= 6;
        System.out.println("\nm = " + m);
        System.out.println("n = " + n);
        System.out.println("l = " + l);

        //increment and decrement ops
        int w = 3;
        w++;
        int q = 6;
        q--;
        System.out.println("\nw = " + w + "\nq = " + q);

        int j = 1;
        int k = 2;
        int o;
        int i;
        o = ++k;
        i = j++;
        o++;
        System.out.println("\nj = " + j);
        System.out.println("k = " + k);
        System.out.println("o = " + o);
        System.out.println("i = " + i);

        //Bitwise ops
        String bynary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a1 = 3;//0011
        int b1 = 6;//0110
        int c1 = a | b;
        int d1 = a & b;
        int e1 = a ^ b;
        int f1 = (~a & b) | (a & ~b);
        int g1 = ~a & 0x0f;//1100 and 15//00001111

        System.out.println("\na1 = " + bynary[a1]);
        System.out.println("b1 = " + bynary[b1]);
        System.out.println("a | b = " + bynary[c1]);
        System.out.println("a & b = " + bynary[d1]);
        System.out.println("a ^ b = " + bynary[e1]);
        System.out.println("(~a & b)|(a & ~b) = " + bynary[f1]);
        System.out.println("~a & 0x0f = " + bynary[g1]);

        //left shift op
        byte a2 = 8;
        int i2 = a2 << 5;//a2 * 2-i 4 asticanov
        System.out.println("i2 = " + i2);

        int jo = 0xFFFFFFE;
        System.out.println("jo = " + jo + "\n");

        int ij;
        int num = 0xFFFFFFE;
        for (ij = 0; ij < 4; ij++) {
            num = num << 2;
            System.out.println(num);
        }

        //right shift op
        int t = 32;
        t = t >> 2;//t : 2-i qarakusu vra
        System.out.println("\nt = " + t);

        int h = -1;
        h = h >> 3;
        System.out.println("\nh = " + h);

        //unsigned right shift op
        int u = -1;
        u = u >>> 28;//32 bit-i -1-i binary tesqi skzbi 28-@ 0 3n darnum;
        System.out.println("\nu = " + u);

        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte g = (byte) 0xf1;
        byte gg = (byte) (g >> 4);
        byte ggg = (byte) (g >>> 4);
        byte gggg = (byte) ((g & 0xff) >> 4);
        System.out.println("\ng = " + g);
        System.out.println("gg = " + gg);
        System.out.println("ggg = " + ggg);
        System.out.println("gggg = " + gggg);
        System.out.println("g = 0x" + hex[(g >> 4) & 0x0f] + hex[g & 0x0f]);
        System.out.println("g >> 4 = 0x" + hex[(gg >> 4) & 0x0f] + hex[gg & 0x0f]);
        System.out.println("g >>> 4 = 0x" + hex[(ggg >> 4) & 0x0f] + hex[ggg & 0x0f]);
        System.out.println("(g & 0xff) >> 4 = 0x" + hex[(gggg >> 4) & 0x0f] + hex[gggg & 0x0f]);

        //relational op
        int a5 = 4;
        int b5 = 1;
        boolean c5 = a5 < b5;
        System.out.println("\nc5 is: " + c5 + "\n");

        //boolean logical op-s
        boolean a6 = true;
        boolean b6 = false;
        boolean c6 = a6 | b6;
        boolean d6 = a6 & b6;
        boolean e6 = a6 ^ b6;
        boolean f6 = (!a6 & b6) | (a6 & !b6);
        boolean g6 = !a6;
        System.out.println("a6 = " + a6);
        System.out.println("b6 = " + b6);
        System.out.println("a|b = " + c6);
        System.out.println("a&b = " + d6);
        System.out.println("a^b = " + e6);
        System.out.println("!a&b|a&!b = " + f6);
        System.out.println("!a = " + g6);

        //&& ||
        int denom = 10;
        int num1 = 1000;
        if (denom != 0 && num1 / denom > 10){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        //?
        int ratio,num2, denom1;
        num2 = 10;
        denom1 = 0;
        ratio = denom1 == 0 ? 0 : num2 / denom1;
        System.out.println("ratio " + ratio);
    }
}
