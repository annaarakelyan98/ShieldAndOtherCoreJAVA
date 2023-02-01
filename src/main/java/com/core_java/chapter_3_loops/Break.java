package com.core_java.chapter_3_loops;

public class Break {
    public static void main(String[] args) {
        // break
        for (int i = 0; i < 4; i++) {
            System.out.println("Artaqin cikli arjeq: " + i);
            System.out.print("    Nerqin cikli arjeq: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break;
                }
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Cikler@ avartvec\n");

        //metkaner
        //1
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("i-n havasar e " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                    }
                    System.out.println("three blockic heto!");
                }
                System.out.println("two blockic heto!");
            }
            System.out.println("one blockic heto!");
        }
        System.out.println("for ciklic heto!\n");

        //2
        done:
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    System.out.println("l is: " + l);
                    if (l == 5) {
                        break done;
                    }
                }
                System.out.println("l ciklic heto!");
            }
            System.out.println("k ciklic heto!");
        }
        System.out.println("j ciklic heto!\n");

        //3
        stop1:
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (y == 2) {
                    break stop1;
                }
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        for (int x = 0; x < 5; x++) {
            stop2:
            for (int y = 0; y < 5; y++) {
                if (y == 2) {
                    break stop2;
                }
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        //continue
        int h;
        for (h = 0; h < 100; h++) {
            if (h % 2 == 0) {
                continue;
            }
            System.out.println("h is: " + h);
        }

        //metka continue
        cont:
        for (int j = 1; j < 10; j++) {
            System.out.print("\nArtaqin cikl: " + j + ", nerqin cikl ");
            for (int k = 1; k < 10; k++) {
                if (k == 5) {
                    continue cont;
                }
                System.out.print(k + " ");
            }
        }
        System.out.println();

        //nerdrvac cikler
        int j;
        for (j = 2; j <= 20; j++) {
            System.out.print("\nBajaneli: " + j + ": ");
            for (int k = 2; k <= j; k++) {
                if (j % k == 0) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
