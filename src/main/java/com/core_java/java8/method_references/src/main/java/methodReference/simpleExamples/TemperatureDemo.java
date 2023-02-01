package com.core_java.java8.method_references.src.main.java.methodReference.simpleExamples;
//ex.3
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp1;

    public HighTemp(int i) {
        this.hTemp1 = i;
    }

    boolean sameTemp(HighTemp hTemp2) {
        return hTemp1 == hTemp2.hTemp1;
    }

    boolean lessTemp(HighTemp h2) {
        return hTemp1 < h2.hTemp1;
    }
}

public class TemperatureDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] highTemps = {
                new HighTemp(79), new HighTemp(82),
                new HighTemp(85), new HighTemp(90),
                new HighTemp(79), new HighTemp(79),
                new HighTemp(81), new HighTemp(83),
        };

        count = counter(highTemps, HighTemp::sameTemp, new HighTemp(79));
        System.out.println(count);

        count = counter(highTemps, HighTemp::lessTemp, new HighTemp(79));
        System.out.println(count);
    }
}
