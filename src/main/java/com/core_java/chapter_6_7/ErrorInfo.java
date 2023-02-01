package com.core_java.chapter_6_7;

class Err {
    String msg;
    int sev;

    Err(String i, int j) {
        msg = i;
        sev = j;
    }
}

class ErrInfo {
    String msgs[] = {
            " Ошибка вывода ",
            " Ошибка ввода ",
            " Отсутствует место на диске ",
            " Выход индекса за границы диапазона "
    };

    int howbad[] = {3, 8, 4, 2};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Несуществующий код ошибки", 0);
        }
    }
}

public class ErrorInfo {
    public static void main(String[] args) {
        ErrInfo err = new ErrInfo();
        Err e;

        e = err.getErrorInfo(1);
        System.out.println(e.msg + " uroven: " + e.sev);
    }
}
