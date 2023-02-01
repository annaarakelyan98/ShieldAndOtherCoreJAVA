package com.core_java.chapter_3_loops;

public class JavaHelp {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice;

        System.out.println("Cпpaвкa:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Bыбepитe: ");

        choice = (char) System.in.read();

        System.out.println();
        switch (choice){
            case '1':
                System.out.println("Инcтpyкция if:\n");
                System.out.println("if (ycлoвиe) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инcтpyкция switch :\n");
                System.out.println("switch (выpaжeниe) {");
                System.out.println("  case константа:");
                System.out.println("    последовательность инструкций");
                System.out.println("    break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Зaпpoc не найден.");
        }
    }
}
