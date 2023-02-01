package com.core_java.chapter_8_packageInterface;

import com.core_java.protectedAccessModifierExample.BookForProtected;
/*
 * classi protected member-@  hasaneli e package-i
 * bolor classnerin, ir jarangord classin,
 * bayc package-ic durs hasaneli e miayn jarangord
 *class-in
 * */

class ExtBook extends BookForProtected {
    private String published;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        published = p;
    }

    public void show() {
        super.show();
        System.out.println(published);
        System.out.println();
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String p) {
        published = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int d) {
        pubDate = d;
    }
}

public class ModificatorProtected {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("Java :руководство для начинающих , 7 - е издание ", "Herbert Shield",
                2015, "Moscow");
        books[1] = new ExtBook("Java :руководство для начинающих , 5 - е издание ", "Herbert Shield",
                2018, "Azbuka");
        books[2] = new ExtBook("Java :руководство для начинающих , 6 - е издание ", "Herbert Shield",
                2012, "Moscow");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        System.out.println("Herbert Shield's all books!");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Herbert Shield") {
                System.out.println(books[i].getTitle());
            }
        }
    }
}
