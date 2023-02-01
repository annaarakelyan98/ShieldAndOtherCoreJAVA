package com.core_java.chapter_8_packageInterface;
/*
 * urish package-ic ogtvelu hamar
 * petq e nshel package-i anun@
 * exp. homework6.ErrorInfo
 *
 * import packageName.className;
 * or
 * import packageName.*
 * ev class ogtagorcum enq aranc nshelu
 * package-i anun@
 * exp. import com.company.demo.Book;
 * books[0] = new Book(...);
 * */

import com.core_java.protectedAccessModifierExample.Book;

public class PackageDemo {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        books[0] = new Book("Java :руководство для начинающих , 7 - е издание ",
                "Герберт Шилдт ", 2018);
        books[1] = new Book("Java :полное руководство , 10 - е издание ",
                "Герберт Шилдт ", 2018);
        books[2] = new Book("Java :руководство для начинающих , 5 - е издание ",
                "Герберт Шилдт ", 2015);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
