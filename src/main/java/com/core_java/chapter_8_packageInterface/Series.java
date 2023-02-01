package com.core_java.chapter_8_packageInterface;

public interface Series {
    int getNext();

    void reset();

    void setStart(int x);

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
}

