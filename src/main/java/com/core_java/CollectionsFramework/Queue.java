package com.core_java.CollectionsFramework;

//queue interface is
// added elements at the end of queue,
// and remove at the head(skizb)

public interface Queue <T>{
    void add(T element);
    T remove();
    int size();
}
