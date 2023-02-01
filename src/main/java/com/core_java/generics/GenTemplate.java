package com.core_java.generics;
/*
* shablonneri sahmanapakum
* nshvum e shabloni ? metasymbol@
*
* verevic
* <? extends superclass>

* nerqevic
* <? super subclass>
* */

class GenTemp<T extends Number> {
    T ob;

    GenTemp(T o) {
        this.ob = o;
    }

    double reciprocal() {
        return 1 / ob.doubleValue();
    }

    double fraction() {
        return ob.doubleValue() - ob.intValue();
    }

    boolean absEqual(GenTemp<?> obj) {
        if (Math.abs(ob.doubleValue()) == Math.abs(obj.ob.doubleValue()))
            return true;
        return false;
    }
}

public class GenTemplate {
    public static void main(String[] args) {
        GenTemp<Integer> iob = new GenTemp<>(5);
        GenTemp<Double> dob = new GenTemp<>(-5.0);
        GenTemp<Long> log = new GenTemp<>(4L);

        System.out.println("iob and dob");
        if (iob.absEqual(dob)) {
            System.out.println("Same absolute values");
        } else {
            System.out.println("Other");
        }

        System.out.println("\niob and lob");
        if (iob.absEqual(log)) {
            System.out.println("Same absolute values");
        } else {
            System.out.println("Other");
        }

        System.out.println(Math.abs(dob.ob));
    }
}
