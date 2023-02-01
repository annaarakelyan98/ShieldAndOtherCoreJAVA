package com.core_java.gorcnakan_Arman_1;

class Name {
    String name;
    int count;

    Name(String n, int c) {
        name = n;
        count = c;
    }
}

public class ObRetByMethods {
    String string[] = {
            "Ann",
            "Arthur",
            "Arman",
            "Vard",
            "Mher",
            "Manuela"
    };

    int count[] = {5, 3, 8, 6, 8,7};

    Name member(int i) {
        if (i >= 0 & i < string.length) {
            return new Name(string[i], count[i]);
        } else return new Name("Not!", 0);
    }

    String noMember(int i) {
        if (i >= 0 & i < string.length) {
            return string[i];
        } else return "Not!";
    }
}


